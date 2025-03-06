-- 코드를 작성해주세요
select count(fi.FISH_NAME) as FISH_COUNT ,fi.FISH_NAME
FROM FISH_INFO f
join FISH_NAME_INFO fi on f.FISH_TYPE = fi.FISH_TYPE
group by fi.FISH_NAME
order by FISH_COUNT desc