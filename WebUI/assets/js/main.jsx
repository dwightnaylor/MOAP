/** @jsx React.DOM */

"use strict";

let React = require("react");
let injectEventTapPlugin = require("react-tap-event-plugin");
let mui = require("material-ui");
let ThemeManager = new mui.Styles.ThemeManager();
let AppBar = mui.AppBar;
let TextField = mui.TextField;
let RaisedButton = mui.RaisedButton;
let CircularProgress = mui.CircularProgress;

injectEventTapPlugin();

let Main = React.createClass({
  getInitialState: function() {
    return {
      isLoading: false
    };
  },

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
        { 
          this.state.isLoading ?
          <CircularProgress
            ref="progressMeter"
            mode="indeterminate"
            size={2}
            style={{position: 'fixed', right: '25%', top: '100px'}}
          />
          : null
        }
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
    this.setState({ isLoading: true });
    var submissionString = this.refs.problemSubmissionField.getValue();
    $.ajax({
      url: "http://wyler.mcanin.ch/moapapi",
      type: "GET",
      crossDomain: false,
      data: "problem="+submissionString,
      success: function(resp){
        this.refs.problemSolutionField.setValue(resp);
        this.setState({ isLoading: false });
      }.bind(this),
      error: function(XMLHttpRequest, textStatus, errorThrown){
        this.refs.problemSolutionField.setValue("An error occured :(");
        this.setState({ isLoading: false });
      }.bind(this)
    });
  }
});

React.render(<Main />, document.getElementById('main-header'));

module.exports = Main;
