-- 코드를 입력하세요
SELECT ANIMAL_ID,NAME,DATE_FORMAT(DATETIME,'%Y-%m-%d') as 날짜
from animal_ins
order by ANIMAL_ID	