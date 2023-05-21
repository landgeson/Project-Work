Steps to run Amazon project
  > Replace "myEmail.com"  with valid EmailID which can be used to login to amazon account in PracticeProject.java file.
  > Replace "myPassoword" with valid amazon account password in PracticeProject.java file.
  > Update web driver path in system property from Practiceprojectlogintest.java file.
  > Update DatabaseConnectivity.java file with your locally running mysql server configurations and credentials.
  > Start sql server locally.
  > Create table under hr(create if dose not exist Or use your local schema) schema using below DDL.
  > CREATE TABLE `order_details` (
	  `Order_ID` int NOT NULL,
	  `Customer_Email_ID` varchar(100) NOT NULL,
	  `Product_Title` varchar(1000) NOT NULL,
	  `Product_Price` decimal(10,5) NOT NULL,
	   PRIMARY KEY (`Order_ID`)
	);
 > Finally run Practiceprojectlogintest.java file and go through logs.
    