/** @jsx React.DOM */

"use strict";

let React = require("react");
let injectEventTapPlugin = require("react-tap-event-plugin");
let mui = require("material-ui");
let ThemeManager = new mui.Styles.ThemeManager();
let AppBar = mui.AppBar;

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
        <h1>React Works!</h1>
      </div>
    );
  }
});

React.render(<Main />, document.getElementById('main-header'));

module.exports = Main;
