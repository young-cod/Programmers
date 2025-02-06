-- 코드를 입력하세요
SELECT ANIMAL_TYPE,count(animal_type) as count 
FROM ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE