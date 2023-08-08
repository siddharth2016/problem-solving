select min(abs(p1.x - p2.x)) shortest from
point p1 inner join point p2
on p1.x != p2.x;