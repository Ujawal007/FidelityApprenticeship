create table customers(
	customerID serial primary key,
	companyName varchar(100),
	city varchar(50),
	country varchar(50) default 'Canada'
);
alter table customers alter column country set default 'India';

insert into customers(companyName,city,country)
values ('TCS','Mumbai','India'),
	   ('Infosys','Bangalore','India'),
	   ('Wipro','Hyderabad','India'),
	   ('Reliance','Delhi','India'),
	   ('Mahindra','Pune','India'),
	   ('HCL','Chennai','India');

create table shippers(
	shipperID serial primary key,
	companyName varchar(100) unique
);

insert into shippers(companyName)
values ('DTDC Express'),
	   ('Blue Dart'),
	   ('India Post'),
	   ('Gati KWE'),
	   ('FedEx India'),
	   ('Delhivery');

create table products(
	productID serial primary key,
	productName varchar(100)
);

insert into products(productName)
values ('Laptop'),
	   ('Smartphone'),
	   ('Tablet'),
	   ('Router'),
	   ('Printer'),
	   ('Monitor');

create table orders(
	orderID serial primary key,
	customerID int references customers(customerID),
	shippedDate date,
	orderDate date,
	constraint shipped_after_order check(shippedDate>orderDate)
);

insert into orders(customerID,shippedDate,orderDate)
values (1,'2024-09-25','2024-09-20'),
	   (2,'2024-09-26','2024-09-22'),
	   (3,'2024-09-27','2024-09-23'),
	   (4,'2024-09-28','2024-09-24'),
	   (5,'2024-09-29','2024-09-25'),
	   (6,'2024-09-30','2024-09-26');

create table orderDetails(
	orderID int references orders(orderID),
	productID int references products(productID),
	quantity int check(quantity>10),
	primary key(orderID,productID)
);

insert into orderDetails(orderID,productID,quantity)
values (1,1,15),
	   (1,2,20),
	   (2,3,12),
	   (3,4,18),
	   (4,5,25),
	   (5,6,30),
	   (6,1,11);


--order date>shipped date
insert into orders(customerID,shippedDate,orderDate)
values (1,'2024-09-18','2024-09-20');

--quantity<10
insert into orderDetails(orderID,productID,quantity)
values (1,1,5);

--unique company name
insert into shippers(companyName)
values('Blue Dart');

