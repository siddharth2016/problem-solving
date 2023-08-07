select department_id, avg(salary) avg_employee_salary from employees
group by department_id
order by avg(salary) desc, department_id;