SELECT animal_id, name
from animal_ins
where name like concat('%', 'el', '%')
  and animal_type = "Dog"
order by name