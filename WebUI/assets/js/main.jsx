/** @jsx React.DOM */

"use strict";

var React = require("react");
var ReactDOM = require("react-dom");
var injectEventTapPlugin = require("react-tap-event-plugin");
var mui = require("material-ui");
var AppBar = mui.AppBar;
var TextField = mui.TextField;
var RaisedButton = mui.RaisedButton;
var CircularProgress = mui.CircularProgress;
var IconButton = mui.IconButton;

injectEventTapPlugin();

var Main = React.createClass({
  getInitialState: function() {
    return {
      isLoading: false,
      helpActive: false
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
    right: 'auto',
    color: '#000'
  },

  helpButtonStyle: {
    width: '40px',
    height: '40px'
  },

  childContextTypes: {
  },

  getChildContext() {
    return {
    };
  },

  render() {
    return (

      <div>
        <AppBar
          title="Mother of All Programs"
          iconElementRight={
            <RaisedButton
              primary={true}
              label="Help"
              onClick={this.toggleHelp}
              style={this.helpButtonStyle}
            /> 
          }
        />
        {
          this.state.helpActive ?
          <div style={{position: 'fixed', right: '0px', top: '64px', bottom: '0px', height: 'auto', padding: '0px 10px', width: '22%', backgroundColor: '#ddd', overflow: 'auto'}}>
            <Help 
            />
          </div>
          : null
        }
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
      url: "http://mcanin.ch:8080/solve",
      type: "GET",
      crossDomain: true,
      data: "problem="+escape(submissionString),
      success: function(resp){
        this.refs.problemSolutionField.setValue(resp);
        this.setState({ isLoading: false });
      }.bind(this),
      error: function(XMLHttpRequest, textStatus, errorThrown){
        this.refs.problemSolutionField.setValue("An error occured :(");
        this.setState({ isLoading: false });
      }.bind(this)
    });
  },

  toggleHelp() {
    this.setState({ helpActive: !this.state.helpActive });   
  }
});

var Help = React.createClass({
  getInitialState: function() {
    return {
    };
  },
  childContextTypes: {
  },
  getChildContext() {
    return {
    };
  },
  render() {
    return (
      <div>
        <h2>Hello, and Welcome to MOAP!</h2>
        <p>MOAP (the Mother Of All Programs) is a program that automatically generates computer algorithms for you! To use MOAP, you simply have to enter your problem in our input language, and MOAP will give you the pseudocode to solve your problem.</p>

        <p>What is this input language? It's very simple, and is meant to be very similar to the way you explain a problem naturally. We've included some examples here:</p>

        <p>"Find an even number in a list of numbers"<br />
        <strong>Given list&lt;int&gt; x; Find y st child(x,y) & even(y)</strong></p>

        <p>"Given a list of things, find two things that are equal"<br />
        <strong>Given list x; Find y,z st child(x,y) & child(x,z) & equal(y,z)</strong></p>

        <p>"Given a list of numbers, find the largest one"<br />
        <strong>Given list&lt;number&gt; x; Find z st child(x,z) & forall(y st child(x,y) : lessThanEqual(y,z))</strong></p>
        
        <p>The Two-Sum Problem:<br />
        "Given a list of numbers and a number s, find two numbers in the list which sum to s"<br />
        <strong>Given list x, int s; Find y,z st child(x,y) & child(x,z) & plus(y,z,s)</strong></p>
      </div>
    );
  }
});

ReactDOM.render((
  <Main />
), document.getElementById('main-header'));
