# https://www.w3schools.com/mysql/func_mysql_date_format.asp
SELECT animal_id, name, date_format(datetime, '%Y-%m-%d')
from animal_ins;