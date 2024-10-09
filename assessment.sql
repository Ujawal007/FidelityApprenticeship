create table customers(
	customer_id varchar(10) primary key,
	customer_name varchar(20),
	address varchar(20),
	phone_no bigint,
	email_id varchar(20)
);

create table delivery_partners(
	partner_id varchar(10) primary key,
	partner_name varchar(20),
	phone_no bigint,
	rating int
);

create table hotel_details(
	hotel_id varchar(10) primary key,
	hotel_name varchar(20),
	hotel_type varchar(20),
	rating int
);

create table orders(
	order_id varchar(10) primary key,
	customer_id varchar(10) references customers(customer_id),
	hotel_id varchar(10) references hotel_details(hotel_id),
	partner_id varchar(10) references delivery_partners(partner_id), 
	order_date date,
	order_amount int
);

INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id)
VALUES
('CUST1001', 'THOMAS', 'KOCHI', 9856325486, 'thomas@gmail.com'),
('CUST1002', 'CHARLES', 'ALLEPY', 9856367486, 'charles@gmail.com'),
('CUST1003', 'SUDHAKAR', 'KOCHI', 9856323869, 'sudhakar@gmail.com'),
('CUST1004', 'JAGADISH', 'ERNAKULAM', 9856326666, 'jagadish@gmail.com'),
('CUST1005', 'ALBERT', 'ALLEPY', 9856328659, 'albert@gmail.com'),
('CUST1006', 'ASHWIN DAS', 'KANNUR', 9856325659, 'ashwin@gmail.com');

INSERT INTO delivery_partners (partner_id, partner_name, phone_no, rating) 
VALUES
('PART1001', 'JOHN', 9876543210, 4),
('PART1002', 'ALEX', 9856327890, 5),
('PART1003', 'MATHEW', 9876541234, 3),
('PART1004', 'RAMAN', 9876509876, 4),
('PART1005', 'SURESH', 9876512345, 5);

INSERT INTO hotel_details (hotel_id, hotel_name, hotel_type, rating)
VALUES
('HOT1001', 'TAJ', 'Luxury', 5),
('HOT1002', 'HOLIDAY INN', 'Business', 4),
('HOT1003', 'MARIOTT', 'Luxury', 5),
('HOT1004', 'IBIS', 'Economy', 3),
('HOT1005', 'NOVOTEL', 'Business', 4);

INSERT INTO orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount)
VALUES
('ORD1001', 'CUST1001', 'HOT1001', 'PART1001', '2024-10-01', 2500),
('ORD1002', 'CUST1002', 'HOT1002', 'PART1002', '2024-10-02', 1800),
('ORD1003', 'CUST1003', 'HOT1003', 'PART1003', '2024-10-03', 3000),
('ORD1004', 'CUST1004', 'HOT1004', 'PART1004', '2024-10-04', 1200),
('ORD1005', 'CUST1005', 'HOT1005', 'PART1005', '2024-10-05', 2000);

select * from hotel_details;


-- Q1
SELECT partner_id, partner_name, phone_no FROM delivery_partners WHERE rating BETWEEN 3 AND 5 ORDER BY partner_id ASC;

-- Q2
UPDATE customers SET phone_no = 9876543210 WHERE customer_id =  'CUST1004';

-- Q3
SELECT customer_id, customer_name, address, phone_no FROM customers WHERE email_id LIKE '%@gmail.com' ORDER BY customer_id ASC;

-- Q4
ALTER TABLE customers alter column customer_id type INT USING customer_id::integer;

-- Q5
alter table hotel_details rename column rating to hotel_rating;

-- Q6
SELECT ( hotel_name || ' is a ' || hotel_type || ' hotel' ) AS HOTEL_INFO FROM hotel_details 
ORDER BY HOTEL_INFO DESC;

-- Q7
SELECT h.hotel_id, h.hotel_name, COUNT(o.order_id) AS NO_OF_ORDERS FROM hotel_details h
INNER JOIN orders o ON h.hotel_id = o.hotel_id
GROUP BY h.hotel_id, h.hotel_name
HAVING COUNT(o.order_id) > 5;

-- Q8
SELECT hotel_id, hotel_name, hotel_type FROM hotel_details
WHERE hotel_id NOT IN ( SELECT hotel_id FROM orders WHERE order_date BETWEEN '2019-05-01' AND '2019-05-31' );

-- Q9
SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount FROM orders o
JOIN customers c ON c.customer_id = o.customer_id
JOIN hotel_details h ON o.hotel_id = h.hotel_id
order BY o.order_id asc;

