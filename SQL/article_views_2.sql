select distinct v1.viewer_id as id from views v1
group by v1.viewer_id, v1.view_date
having count(distinct v1.article_id) > 1
order by v1.viewer_id;