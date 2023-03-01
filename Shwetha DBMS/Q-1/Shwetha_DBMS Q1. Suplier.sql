create database Ecommerce ;
use Ecommerce;
CREATE TABLE if NOT EXISTS product(
	PRO_ID INT AUTO_INCREMENT,
	PRO_NAME VARCHAR(20) NOT NULL DEFAULT('Dummy'),
	PRO_DESC VARCHAR(60),
	CAT_ID INT,
	PRIMARY KEY (PRO_ID),
	FOREIGN KEY(CAT_ID) REFERENCES category(CAT_ID)
);