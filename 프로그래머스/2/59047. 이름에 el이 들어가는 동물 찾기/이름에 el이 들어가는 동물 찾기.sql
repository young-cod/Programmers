-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME 
from animal_ins
where lower(name) like '%el%' and animal_type = 'Dog'
order by name