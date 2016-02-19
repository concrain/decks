Technologies used:
 Springboot
 Gradle
 Java
 Groovy
 Apache CXF

A backup copy of the modified slwebservices.wsdl is located in the doc/ dir
You can access the generated source files in the generatedsources/ dir

Generate Apache CXF class files from WSDL with the command line
 rxa2383$ ~/apache-cxf-3.1.1/bin/wsdl2java -d build/src ~/Desktop/spring-cxf-client/ws-client/src/main/resources/wsdl/hello.wsdl

Generate Apache CXF class files from WSDL with gradle
 gradle clean
 gradle build
