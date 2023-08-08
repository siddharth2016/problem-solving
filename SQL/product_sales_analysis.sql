select s.user_id, sum(p.price * s.quantity) spending from
sales s inner join product p
on s.product_id = p.product_id
group by s.user_id
order by spending desc, s.user_id;