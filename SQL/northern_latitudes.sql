select round(max(lat_n), 4) "max" from station
where lat_n < 138.2523;