-- CRUD

SELECT * FROM people WHERE NOT gender = 'M';

SELECT * FROM people WHERE "name" NOT IN ('Riya', 'Reena');

SELECT * FROM people WHERE "name" LIKE '%k%';

SELECT * FROM people WHERE "name" IS NOT NULL;

SELECT DISTINCT gender FROM people ORDER BY gender;

ALTER TABLE relation 
ADD FOREIGN KEY (cid) REFERENCES people(id);

DELETE FROM people WHERE id = 6;

SELECT * FROM relation;

SELECT 'hello' FROM relation;

SELECT * FROM people;

SELECT count("name"), gender FROM people GROUP BY gender;
