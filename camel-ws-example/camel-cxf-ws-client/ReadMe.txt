Camel Router Project for Blueprint (OSGi)
=========================================
Executes an external web service endpoint call
CXF Web Services properties defined in cxfEndpoint

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:org.example/camel-ws-client/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
    

