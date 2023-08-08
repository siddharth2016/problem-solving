select candidate_id from candidates
where skill in ('Python', 'Tableau', 'MySQL')
group by candidate_id
having count(skill) = 3
order by candidate_id;