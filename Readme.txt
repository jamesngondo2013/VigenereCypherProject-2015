JAMES NGONDO - G00304277 - Vigenere Cypher
===================================================

How to run the Vigenere Cypher Application Remotely
===================================================
1) Extract the G00304277 zip folder
2) Find the cracker.war file and place it inside Tomcat ->webapps folder
3) Run the Tomcat Startup.bat file
4) On the root folder ->C:\G00304277 -> type ->java -cp "./vigenere.jar;lib/*" ie.gmit.sw.Servant
5) Remote service starts
6) Go to the browser, type -> http://localhost:8080/cracker
7) Enter the Cypher text
8) Click the Crack Cypher button

To import and run the project on Eclipse J2EE
=================================================== 
1) Import the cracker.war file to your Eclipse J2EE workspace
2) Import the RMI folder into your Eclipse J2EE workspace
3) If there are errors on the CrackerHandler java class, please just change the Runtime on eclipse to Tomcat v8.0 
4) Run the Servant class from the RMI project folder
5) Right click on the cracker project folder -> Run As -> Run on Server -->Tomcat v8.0 at localhost --> Finish
6) This opens a browser in eclipse (Index.jsp) page -> Vigenere Cypher
   ->Paste/ type your cypher text and click the Crack Cypher button

NOTE: Ensure that you have the WarAndPeace-Tolstoy.txt file in both your root folders
====

GitHub Link: https://github.com/jamesngondo2013/VigenereCypherProject-2015.git