select "Yes" as triangle from Triangle
where x + y >= z or y + z >= x or x + z >= y
union
select "No" as triangle from Triangle
where x + y < z or y + z < x or x + z < y;