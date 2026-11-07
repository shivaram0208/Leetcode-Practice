# Write your MySQL query statement below
select t1.product_name, sum(t2.unit) as unit from Products t1 Left Join Orders t2 On t1.product_id = t2.product_id 
where Year(t2.order_date) = 2020 And Month(t2.order_date) = 02 group by t2.product_id having sum(t2.unit) >= 100;