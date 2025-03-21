SELECT animal_type, coalesce(name, "No name") as name, sex_upon_intake
from animal_ins
order by animal_id;

SELECT animal_type, if(is null, "No name", name) as name, sex_upon_intake
from animal_ins
order by animal_id;

SELECT animal_type, ifnull(name, "No name") as name, sex_upon_intake
from animal_ins
order by animal_id;

SELECT animal_type, case when name is null then "No name" else name end as name, sex_upon_intake
from animal_ins
order by animal_id;