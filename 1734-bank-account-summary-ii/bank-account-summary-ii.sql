# Write your MySQL query statement below
select t1.name, sum(t2.amount) as balance from Users t1 Left Join Transactions t2 On t1.account = t2.account 
    Group by t2.account Having sum(t2.amount) > 10000;