# Write your MySQL query statement below
select sample_id, dna_sequence, species, 
    Case When dna_sequence Like 'ATG%' Then 1 Else 0 End as has_start,
    Case When dna_sequence REGEXP '(TAA|TAG|TGA)$' Then 1 Else 0 End as has_stop,
    Case When dna_sequence Like '%ATAT%' Then 1 Else 0 End as has_atat,
    Case When dna_sequence Like '%GGG%' Then 1 Else 0 End as has_ggg
from Samples;