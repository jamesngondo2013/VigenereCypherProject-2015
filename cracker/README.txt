How to run the application on Eclipse JEE-Mars
===============================================
1) Download zip from the Vigenere Cypher Project from GitHub
2)Unzip and locate the cracker folder
3)Import the folder to your JEE-Eclipse
->ensure that you have Apache Tomcat v8.0 installed
->create a new server in your eclipse JEE
4)Run the VigenereBreakerImpl.java
->This runs and generate all possible keys
5)Right click on the project(cracker)
->Run As --> Run on Server -->Tomcat v8.0 at localhost --> Finish  
6)Opens a browser in eclipse (Index.jsp) page
->Paste/ type your cypher text and click the Crack Cypher button


Run the application from the Web Browser
=================================================
1) Copy the cracker.war file to Tomcat -> webapps folder
2)Run the Tomcat Startup.bat from the bin folder
3)Put the cracker.jar file in the Tomcat ->webapps ->cracker->WEB-INF->lib
4)Go to web browser -> Type localhost:8080/cracker
5) Type the Cypher text and set the key length to 4
6)Click Crack Cypher buttom