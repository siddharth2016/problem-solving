select e.employeeNumber, e.firstName, e.lastName from
employees e left join customers c
on e.employeeNumber = c.salesRepEmployeeNumber
where c.salesRepEmployeeNumber is null
order by e.employeeNumber;