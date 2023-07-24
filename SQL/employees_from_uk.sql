select e.employee_id, e.first_name, e.last_name, d.department_id, e.salary, l.location_id,
l.street_address from 
employees e inner join departments d
on e.department_id = d.department_id
inner join locations l
on d.location_id = l.location_id
inner join countries c
on l.country_id = c.country_id
where c.country_name = 'United Kingdom'
order by e.employee_id;