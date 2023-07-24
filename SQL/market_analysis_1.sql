select u.user_id as buyer_id, u.join_date, ifnull(o.ords, 0) as orders_in_2019 from 
users u left join (
    select buyer_id, count(order_id) as ords
    from orders
    where order_date >= '2019-01-01' and order_date <= '2019-12-31'
    group by buyer_id
) o on u.user_id = o.buyer_id
order by u.user_id;

-------------------------------------------------------

select u.user_id as buyer_id, u.join_date, count(o.order_id) as orders_in_2019 from
users u left join orders o 
on u.user_id = o.buyer_id and year(o.order_date) = '2019'
group by u.user_id, u.join_date
order by u.user_id;