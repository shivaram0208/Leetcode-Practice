# Write your MySQL query statement below
select stock_name, 
    Sum(
        Case When operation = 'Buy' Then -price
             When operation = 'Sell' Then price
        End
    ) as capital_gain_loss
from Stocks group by stock_name;
