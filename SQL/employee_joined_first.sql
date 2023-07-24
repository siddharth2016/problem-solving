select e1.employee_id, e1.first_name, e1.last_name from
employees e1 inner join employees e2
on e1.manager_id = e2.employee_id and e1.hire_date < e2.hire_date
order by e1.employee_id;