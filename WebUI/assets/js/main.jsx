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
        <AppBar />
        <br />
        <br />
        <TextField
          id="problemSubmissionField"
          ref="problemSubmissionField"
          fullWidth={false}
          hintText="Type your problem to be solved here"
          multiLine={false}
        />
        <RaisedButton
          primary={true}
          label="Submit Problem"
          onClick={this.submitProblem}
        />
        <br />
        <TextField
          id="problemSolutionField"
          ref="problemSolutionField"
          floatingLabelText="Solution"
          disabled={true}
          multiLine={true}
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
