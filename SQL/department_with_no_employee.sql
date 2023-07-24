select d.department_id, d.department_name from 
employees e right join departments d
on e.department_id = d.department_id
where e.employee_id is null
order by d.department_id;