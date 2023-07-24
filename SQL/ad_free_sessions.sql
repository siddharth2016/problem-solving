select distinct p.session_id from 
Playback p inner join Ads a 
on p.customer_id = a.customer_id
and (a.timestamp < p.start_time or a.timestamp > p.end_time)
order by p.session_id;