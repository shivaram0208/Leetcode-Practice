# Write your MySQL query statement below
select t1.id, 
    Case When t1.p_id IS NULL Then 'Root'
         When Exists (select 1 from Tree t2 where t2.p_id = t1.id) Then 'Inner'
         ELSE 'Leaf'
         END as type
    from Tree t1;