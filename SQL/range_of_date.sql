select employee_id, job_id
from job_history
where start_date >= '1998-01-01' and end_date <= '1999-12-31'
order by employee_id, job_id;