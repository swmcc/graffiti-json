@Grapes([
@Grab(group='org.mikeneck.graffiti', module='mike-graffiti-core', version='1.0'),
@Grab('org.eclipse.jetty.aggregate:jetty-server:8.1.2.v20120308'),
@Grab('org.eclipse.jetty.aggregate:jetty-servlet:8.1.2.v20120308'),
@Grab(group='javax.servlet', module='javax.servlet-api', version='3.0.1'),
@Grab(group='com.google.code', module='groovy-http', version='0.1'),
@GrabExclude(group='org.apache.ant', module='ant', version='1.7.1'),
@GrabExclude(group='org.apache.ant', module='ant-launcher', version='1.7.1')
])

import graffiti.*

@Get('/something')
def SomeFunction() {
  def json = new groovy.json.JsonBuilder()

  def rawResults = [1, 2, 3, 4, 5, 6]

  json.results {
    id rawResults
  }

  json.toString()
}

// static files served from here
Graffiti.root 'public'

// required to process annotations
Graffiti.serve this
Graffiti.config.port = 9393
Graffiti.start()
