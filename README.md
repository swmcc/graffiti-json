# Graffiti-json

My version of a graffiti app that returns json. 

## Why

I've found myself needing to access files only the JVM can touch a few times. Instead of installing an awkward third party bit of software or converting a portion of an app to talk to the JVM I want to just get json back and get on with my day to day work. This script is not intended for production use, it just merely a way of getting something up and running very quick. 

## Running the server

The server is set to run on port 9393 so just:

 ```
	git clone https://github.com/swmcc/graffiti-json.git
	cd graffiti-json
	groovy GraffitiServer.groovy # Will take a while to get all the dependicies
 ```

Then 
 ```
	curl http://localhost:9393/something
 ```

Will return:
 ```
    {"results":{"id":[1,2,3,4,5,6]}
 ```
As stated before this is just to get things 'up and running'.
