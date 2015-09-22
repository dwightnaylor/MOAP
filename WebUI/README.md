WebUI for MOAP
==============

To get this working you need `npm`. cd into ./assets/js and run `npm install react react-tap-event-plugin material-ui` and then `npm install -g browserify reactify`.
To compile the js from inside the assets/js folder (otherwise change paths): `browserify -t reactify main.js > bundle.js`.
