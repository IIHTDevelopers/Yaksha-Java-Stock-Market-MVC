* To build your project use command:
	mvn clean package -Dmaven.test.skip

* To launch your application:
	mvn tomcat7:run

* Default credentials for MySQL:
	Username: root
	Password: pass@word1

* To login to mysql instance: Open new terminal and use following command:
      a.	sudo systemctl enable mysql
      b.	sudo systemctl start mysql
      NOTE: After typing the second sql command (sudo systemctl start mysql), you may encounter a warning message like:
	System has not been booted with systemd as init system (PID 1). Can't operate.
	Failed to connect to bus: Host is down
      --> Please note that this warning is expected and can be disregarded. Proceed to the next step.
      c.	mysql -u root -p
The last command will ask for password which is ‘pass@word1’

* Mandatory: Before final submission run the following command: 
	mvn test

* To ensure your code is saved and available for later use, remember to use the CTRL+Shift+B command on your code IDE.
   This will push or save the updated contents in the internal git/repository.
   It is also important to use CTRL+Shift+B before the final submission to evaluate the code quality.
