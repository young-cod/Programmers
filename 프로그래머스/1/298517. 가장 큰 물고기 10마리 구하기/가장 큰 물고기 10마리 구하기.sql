-- 코드를 작성해주세요
SELECT ID,LENGTH FROM FISH_INFO
where length is not null and ID not in (4,5)
order by length desc, id
limit 10 