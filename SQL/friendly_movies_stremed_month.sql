select distinct c.title from 
TVProgram t inner join content c
on t.content_id = c.content_id
where year(t.program_date) = '2020' and month(t.program_date) = 6;