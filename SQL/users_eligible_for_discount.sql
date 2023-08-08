select user_id from purchases
where time_stamp >= '2022-03-08' and time_stamp <= '2022-03-20'
and amount >= 1000
order by user_id;