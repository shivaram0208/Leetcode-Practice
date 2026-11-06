# Write your MySQL query statement below
select t2.unique_id, t1.name from Employees t1 Left Join EmployeeUNI t2 On t1.id = t2.id;