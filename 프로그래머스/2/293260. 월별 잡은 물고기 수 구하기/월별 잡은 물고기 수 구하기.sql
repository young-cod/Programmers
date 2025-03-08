-- 코드를 작성해주세요
select count(*) as FISH_COUNT,MONTH(time) as MONTH
from fish_info
group by MONTH having FISH_COUNT
order by MONTH