select a.city from
person p left join address a
on p.personid = a.personid
order by a.city;