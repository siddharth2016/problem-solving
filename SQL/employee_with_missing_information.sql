CREATE VIEW Employees_Salaries AS 
SELECT * FROM employees LEFT JOIN salaries USING (employee_id)
UNION ALL
SELECT * FROM salaries s LEFT Join employees e USING (employee_id)
WHERE e.employee_id IS NULL;

SELECT employee_id FROM Employees_Salaries WHERE name IS NULL OR salary IS NULL;