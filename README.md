# OSGIRestServices

This example demonstrates how to develop a simple OSGi bundle registering a Jersey based RESTful web service as an OSGi HttpService

The mapping of the URI path space is 
	http://localhost:8080/OSGIStudentRestServer/rest/helloworld


To start the felix run 
java -jar bin/felix.jar

To install bundle in felix run 
g! install file:/path/to/bundle.jar

To run the example, you would need to build the OSGi bundle in the bundle module and install it to an OSGi runtime (e.g. Apache Felix) together with other OSGi bundles.

For this task we are going to use the OSGi Bundle Repository – in Felix console type obr:list to get a list of available bundles

g! obr:list
Apache Felix Bundle Repository (1.4.3, ...)
Apache Felix Configuration Admin Service (1.0.4, ...)
Apache Felix Declarative Services (1.4.0, ...)
Apache Felix EventAdmin (1.0.0)
Apache Felix File Install (2.0.8, ...)
Apache Felix Gogo Shell Commands (0.2.0)
Apache Felix Gogo Shell Console (0.2.0)
Apache Felix Gogo Shell Launcher (0.2.0)
Apache Felix Gogo Shell Runtime (0.2.0)
Apache Felix Http Api (2.0.4)
Apache Felix Http Base (2.0.4)
Apache Felix Http Bridge (2.0.4)
Apache Felix Http Bundle (2.0.4)
Apache Felix Http Jetty (2.0.4, ...)
Apache Felix Http Proxy (2.0.4)
Apache Felix Http Samples - Filter (2.0.4)
Apache Felix Http Samples - Whiteboard (2.0.4)
Apache Felix Http Whiteboard (2.0.4)
Apache Felix iPOJO (1.6.2, ...)
Apache Felix iPOJO (0.8.0)
Apache Felix iPOJO API (1.6.0, ...)
Apache Felix iPOJO Arch Command (1.6.0, ...)
Apache Felix iPOJO Composite (1.6.0, ...)
[..]

Now install the API and the Jetty server using obr:deploy

obr:deploy "Apache Felix Http Api"
obr:deploy "Apache Felix Http Jetty"

Now start the new installed bundles
g! lb
START LEVEL 1
   ID|State      |Level|Name
    0|Active     |    0|System Bundle (3.0.1)
    1|Active     |    1|Apache Felix Bundle Repository (1.6.2)
    2|Active     |    1|Apache Felix Gogo Command (0.6.0)
    3|Active     |    1|Apache Felix Gogo Runtime (0.6.0)
    4|Active     |    1|Apache Felix Gogo Shell (0.6.0)
    6|Installed  |    1|OSGIStudentRestServer (0.0.1.SNAPSHOT)|0.0.1.SNAPSHOT
    7|Installed  |    1|Apache Felix Http Bundle (2.0.4)
    8|Installed  |    1|Apache Felix Http Api (2.0.4)
    9|Installed  |    1|Apache Felix iPOJO (1.6.2)
   10|Installed  |    1|Apache Felix Http Jetty (2.0.4)

g! start 7
g! start 8
g! start 9
g! start 10

And finally start your bundle
g! start 6



