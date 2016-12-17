CREATE TABLE Customer (
 C_No CHAR(10) NOT NULL,
 C_Name CHAR(10),
 C_Phone CHAR(10),
 C_Cellphone CHAR(10),
 C_Email CHAR(10),
 C_Address CHAR(10)
);

ALTER TABLE Customer ADD CONSTRAINT PK_Customer PRIMARY KEY (C_No);


CREATE TABLE Supplier (
 Supplier_ID CHAR(10) NOT NULL,
 Supplier_Name CHAR(10),
 Supplier_Phone CHAR(10),
 Supplier_Address CHAR(10),
 Supplier_Email CHAR(10)
);

ALTER TABLE Supplier ADD CONSTRAINT PK_Supplier PRIMARY KEY (Supplier_ID);


CREATE TABLE Product (
 P_No CHAR(10) NOT NULL,
 Supplier_ID CHAR(10) NOT NULL,
 P_Name CHAR(10),
 P_Price CHAR(10),
 P_Description CHAR(10),
 P_Category CHAR(10),
 P_Color CHAR(10),
 P_Size CHAR(10),
 P_Discount CHAR(10),
 P_Quantity CHAR(10),
 P_Safe CHAR(10)
);

ALTER TABLE Product ADD CONSTRAINT PK_Product PRIMARY KEY (P_No);


CREATE TABLE Purchase (
 PO_ID CHAR(10) NOT NULL,
 P_No CHAR(10) NOT NULL,
 Supplier_ID CHAR(10) NOT NULL,
 PO_Quantity CHAR(10),
 PO_Date CHAR(10),
 PO_Totalprice CHAR(10),
 AD_Date CHAR(10)
);

ALTER TABLE Purchase ADD CONSTRAINT PK_Purchase PRIMARY KEY (PO_ID);


CREATE TABLE Sales (
 Sales_ID CHAR(10) NOT NULL,
 C_No CHAR(10) NOT NULL,
 P_No CHAR(10) NOT NULL,
 Supplier_ID CHAR(10) NOT NULL,
 Sales_Quantity CHAR(10),
 Sales_Totalprice CHAR(10),
 Sales_Date CHAR(10),
 Order_Time CHAR(10),
 AR_Date CHAR(10)
);

ALTER TABLE Sales ADD CONSTRAINT PK_Sales PRIMARY KEY (Sales_ID);
