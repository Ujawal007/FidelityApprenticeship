create table Worker(
	worker_id serial primary key,
	first_name varchar(50),
	last_name varchar(50),
	salary decimal(10,2),
	joining_date date,
	department varchar(20)
);

create table Title(
	worker_ref_id int,
	worker_title varchar(100),
	affected_from date,
	foreign key (worker_ref_id) references Worker(worker_id)
);

create table Bonus(
	worker_ref_id int,
	bonus_amount decimal(10,2),
	bonus_date date,
	foreign key (worker_ref_id) references Worker(worker_id)
);

INSERT INTO worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'),
(2, 'Niharika', 'Verma', 80000, '2011-02-01', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
(7, 'Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
(8, 'Geetika', 'Chauhan', 90000, '2011-04-14', 'Admin');

INSERT INTO title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst. Manager', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');

INSERT INTO bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'),
(2, 3500, '2011-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');

--Q1
select w.first_name,w.salary,t.worker_title from worker w join title t
on w.worker_id = t.worker_ref_id;

--Q2
create or replace function get_worker_count_by_nth_highest_salary(n int)
returns int as $$
declare
	nth_salary numeric;
begin
	select distinct salary into nth_salary from worker
	order by salary desc offset n limit 1;
	
	if nth_salary is null then return 0;
	end if;
	
	return (select count(*) from worker where salary = nth_salary);
end;
$$ language plpgsql;

select get_worker_count_by_nth_highest_salary(1);