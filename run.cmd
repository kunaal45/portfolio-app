@echo off
SET MVN_HOME=%USERPROFILE%\Tools\apache-maven-3.9.16
SET PATH=%MVN_HOME%\bin;%PATH%
echo Starting portfolio-app on http://localhost:8081 ...
mvn spring-boot:run
pause
