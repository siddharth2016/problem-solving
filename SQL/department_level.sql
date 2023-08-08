SELECT
 department_id as Department,
 COUNT(employee_id) as No_of_employees,
 CASE
  WHEN COUNT(employee_id) = 1 THEN "Junior Department"
  WHEN COUNT(employee_id) <= 4 THEN "Intermediate Department"
  WHEN COUNT(employee_id) >4 THEN "Senior Department"
 END as Department_level
FROM
 employees
GROUP BY
 department_id
ORDER BY
 No_of_employees,
 Department;