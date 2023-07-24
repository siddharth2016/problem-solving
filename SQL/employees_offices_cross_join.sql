select e.employeeNumber, e.firstName, e.lastName, o.officeCode, o.city from
employees e cross join offices o
order by e.employeeNumber, o.officeCode;