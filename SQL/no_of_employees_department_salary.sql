select d.department_name, count(e.employee_id) as No_of_Employees, sum(e.salary) as Total_Salary from
departments d left join employees e
on d.department_id = e.department_id
group by d.department_name
order by d.department_name;