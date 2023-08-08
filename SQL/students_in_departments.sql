select d.dept_name, count(s.student_id) student_number from
student s right join department d
on s.dept_id = d.dept_id
group by d.dept_name
order by student_number desc, d.dept_name;