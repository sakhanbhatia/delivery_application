# Delivery Notification Application - Java  
In this application, I have developed a notification system to send notifications about delivery
requests to drivers. When a store gets a product delivery orders should be created at store and a
delivery request should be broadcasted to all drivers.  

# Implementation Description
  
• Design Pattern  
I have used the Observer Design pattern for the implementation of this application as it is best suited for these type of applications.  
The drivers are the observers here, waiting for a notification from the Shops (Publisher). As soon as a new delivery request is generated and added
to a shop, all the drivers that are subscribed to that shop get a notification for the delivery request.
  
• How is the flexibility, of your implementation, e.g., how you add or remove in future new types? 
The Shop (Publisher) has a list of Drivers (Observer), so any number of drivers can be added to each shop, just by calling the register method.  
Similarly, a driver can easily unsubscribe from the shop by calling the remove method.
  
• How is the simplicity and understandability of your implementation?  
My code is very simple in terms of logic and implementation. I have followed the layout of a observer pattern, so I have an interface for Publisher, an interface for Subscriber.   
The Shop implements from Publisher and the Driver implements from Subscriber.  
Apart from these, I have a class called DeliveryRequest that contains all the details of a delivery request.  
  
My code has an adequate amount of comments which explains which each part of the code is doing and the variable names explain their use, so it is easily understood.  
  
  
• How you avoided duplicated code?  
Yes, I have followed the DRY principle in my implementation. According to me there is no duplication of code.  
  
# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

Type on the command line: (Windows PowerShell)

```bash
./run.sh
```

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

You can find more info about coveralls 

https://coveralls.io/

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```

