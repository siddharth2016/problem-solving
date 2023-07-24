select e.employee_id, d.department_id, e.first_name, e.last_name, e.job_id, d.department_name from 
employees e inner join departments d
on e.department_id = d.department_id
where d.department_name = 'Human Resources'
order by e.employee_id;