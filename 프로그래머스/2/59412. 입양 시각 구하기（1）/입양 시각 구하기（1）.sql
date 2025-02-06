-- 코드를 입력하세요
SELECT date_format(DATETIME,'%H') as HOUR,count(*) as COUNT
FROM ANIMAL_OUTS 
GROUP BY HOUR
HAVING HOUR between 9 and 19
ORDER BY CAST(HOUR as signed)