/** @jsx React.DOM */

"use strict";

let React = require("react");
let injectEventTapPlugin = require("react-tap-event-plugin");
let mui = require("material-ui");
let ThemeManager = new mui.Styles.ThemeManager();
let AppBar = mui.AppBar;
let TextField = mui.TextField;
let RaisedButton = mui.RaisedButton;

injectEventTapPlugin();

let Main = React.createClass({
  submissionFieldStyle: {
    display: 'block',
    width: '25%',
    margin: '15px auto',
    left: 'auto',
    right: 'auto'
  },

  submitButtonStyle: {
    display: 'block',
    width: '20%',
    height: '50px',
    margin: '15px auto',
    left: 'auto',
    right: 'auto'
  },
  
  solutionFieldStyle: {
    display: 'block',
    width: '40%',
    margin: '15px auto',
    left: 'auto',
    right: 'auto'
  },

  childContextTypes: {
    muiTheme: React.PropTypes.object
  },

  getChildContext() {
    return {
      muiTheme: ThemeManager.getCurrentTheme()
    };
  },

  render() {
    return (
      <div>
        <AppBar
          title="Mother of All Programs"
        />
        <TextField
          id="problemSubmissionField"
          ref="problemSubmissionField"
          fullWidth={false}
          hintText="Problem to be solved"
          multiLine={true}
          style={this.submissionFieldStyle}
        />
        <RaisedButton
          primary={true}
          label="Submit Problem"
          onClick={this.submitProblem}
          style={this.submitButtonStyle}
        />
        <TextField
          id="problemSolutionField"
          ref="problemSolutionField"
          floatingLabelText="Solution"
          disabled={true}
          multiLine={true}
          style={this.solutionFieldStyle}
        /> 
      </div>
    );
  },

  submitProblem() {
    var submissionString = this.refs.problemSubmissionField.getValue();
    $.ajax({
      url: "http://wyler.mcanin.ch/moapapi",
      type: "GET",
      crossDomain: false,
      data: "problem="+submissionString,
      success: function(resp){
        this.refs.problemSolutionField.setValue(resp);
      }
    });
  }
});

React.render(<Main />, document.getElementById('main-header'));

module.exports = Main;
