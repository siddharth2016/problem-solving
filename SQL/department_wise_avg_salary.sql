select d.deptname department_name, round(avg(e.salary), 2) average_salary from
employee e inner join department d
on e.deptid = d.deptid
group by d.deptname
order by round(avg(e.salary), 2);