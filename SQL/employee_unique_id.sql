select eu.unique_id from 
employees e left join employeeUNI eu
on e.id = eu.id;