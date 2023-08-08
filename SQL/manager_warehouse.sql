select w.name as warehouse_name, sum(w.units * p.width * p.length * p.height) volume from
warehouse w inner join products p
on w.product_id = p.product_id
group by w.name
order by volume;