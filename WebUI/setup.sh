#!/bin/bash
echo "Hello, this will help you customize this website for your own server!"
echo "Please enter the url of the server you are hosting the web server."
echo "Be sure to include the port that the web server will be accessible by on"
echo -n "(full form: e.g. http://localhost:8080): "
read -r servername
sed  -i.bak "/url: \"/s/.*/url: \"$(sed -e 's/\//\\\//g' <<< $servername)\/solve\",/g" ./assets/js/bundle.js
rm ./assets/js/bundle.js.bak

cd ./rest
nohup python api.py &

echo "Your API should now be running!"
