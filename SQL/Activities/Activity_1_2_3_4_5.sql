REM   Script: Activity_1_2_3_4_5
REM   FST SQL

    create TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

    create TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

Describe salesman


Describe salesman


INSERT ALL into salesman VALUES (1608, Vidya, Bangalore, 20);

INSERT ALL into salesman VALUES (1608, "Vidya", "Bangalore", 20) 
SELECT 1 from DUAL;

    create TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

Describe salesman


INSERT ALL  
    into salesman VALUES (1608, "Vidya", "Bangalore", 20) 
SELECT 1 from DUAL;

INSERT into salesman VALUES (1608, "Vidya", "Bangalore", 20);

    create TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar2(20), salesman_city varchar2(20), commission int);

Describe salesman


INSERT into salesman VALUES (1608, "Vidya", "Bangalore", 20);

select * from salesman;

INSERT into salesman VALUES (1608, 'Vidya', 'Bangalore', 20);

select * from salesman;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT salesman_id and salesman_city from salesman;

SELECT salesman_id,salesman_city from salesman;

SELECT * from salesman where salesman_city = 'Paris';

SELECT salesman_id,commission from salesman where salesman_name = 'Paul Adam';

SELECT salesman_id,commission FROM salesman WHERE salesman_name = ('Paul Adam', 'Vidya');

SELECT salesman_id,commission FROM salesman WHERE salesman_name IN ('Paul Adam', 'Vidya');

SELECT salesman_id,commission FROM salesman WHERE salesman_name = 'Paul Adam';

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade = 200 where salesman_city = 'Rome';

SELECT * FROM salesman;

UPDATE salesman SET grade = 300 where salesman_name = 'James Hoog';

SELECT * FROM salesman;

INSERT INTO salesman VALUES(5009, 'James Hoog', 'Russia', 100);

INSERT INTO salesman VALUES(5009, 'James Hoog', 'Russia', 100);

INSERT INTO salesman VALUES(5009, 'James Hoog', 'Russia', 10);

UPDATE salesman SET salesman_name = 'Pierre' where salesman_name = 'McLyon';

SELECT * FROM salesman;

INSERT INTO salesman VALUES(5009, 'James Hoog', 'Russia', 10, 100);

SELECT * FROM salesman;

UPDATE salesman SET grade = 300 where salesman_name = 'James Hoog';

SELECT * FROM salesman;

