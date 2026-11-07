# Write your MySQL query statement below
select Ifnull((select num from MyNumbers group by num having count(*) = 1 order by num DESC Limit 1), null) as num;