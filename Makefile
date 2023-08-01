
all : clean verify compile test package execute



clean:
	mvn clean

verify:
	mvn verify

compile :
	mvn compile

test :
	mvn test

package:
	mvn package

execute:
	java -jar C:\Users\Rose\SolarSystem\solarSystem\target\solarSystem-1.0-SNAPSHOT-jar-with-dependencies.jar