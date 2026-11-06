# Write your MySQL query statement below
select x, y, z, CASE
    When Greatest(x, y, z) < ((x + y + z) - Greatest(x, y, z)) Then 'Yes' Else 'No' End as triangle from Triangle; 