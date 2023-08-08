select m.employee_id, m.name, count(e.employee_id) reports_count, round(avg(e.age)) average_age from
Employees e inner join Employees m
on e.reports_to = m.employee_id
group by m.employee_id, m.name
order by m.employee_id;