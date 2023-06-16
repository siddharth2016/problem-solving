-- CREATE TABLE

-- create table people 
-- (   "id" INT not null primary key,
--     "name" varchar(30),
--     "gender" varchar(1)
-- );
-- 
-- create table relation 
-- (
--     "cid" INT,
--     "pid" int
-- );

-- INSERT DATA

-- insert into people
-- values (1, 'Riya', 'F');
-- 
-- insert into people
-- values (2, 'Aman', 'M');
-- 
-- insert into people
-- values (3, 'Rakesh', 'M');
-- 
-- insert into people
-- values (4, 'Lucky', 'M');
-- 
-- insert into people
-- values (5, 'Reena', 'F');
-- 
-- insert into people
-- values (6, 'Raina', 'F');
-- 
-- insert into people
-- values (7, 'Rohit', 'M');
-- 
-- insert into people
-- values (8, 'Mohit', 'M');
-- 
-- insert into people
-- values (9, 'Meena', 'F');
-- 
-- Insert into relation
-- values (3, 1);
-- 
-- Insert into relation
-- values (3, 2);
-- 
-- Insert into relation
-- values (6, 4);
-- 
-- Insert into relation
-- values (6, 5);
-- 
-- Insert into relation
-- values (7, 8);
-- 
-- Insert into relation
-- values (7, 9);

-- PRINT BOTH TABLES

-- select * from people;
-- 
-- select * from relation;



SELECT P.name AS child, Q.name AS father, A.name AS mother
FROM people P INNER JOIN relation R
ON P.id = R.cid
INNER JOIN (
    SELECT Y.id, Y.name FROM
    people Y INNER JOIN relation X
    ON Y.id = X.pid
    WHERE Y.gender = 'M'
) AS Q
ON R.pid = Q.id
INNER JOIN (
    SELECT W.id, T.name
    FROM people W INNER JOIN relation E
    ON W.id = E.cid
    INNER JOIN people T
    ON E.pid = T.id
    WHERE T.gender = 'F'
) AS A
ON R.cid = A.id;