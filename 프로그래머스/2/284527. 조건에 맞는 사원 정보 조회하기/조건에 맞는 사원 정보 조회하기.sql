

# select hg.SCORE,he.EMP_NO,he.EMP_NAME,he.POSITION,he.EMAIL
# from HR_GRADE hg
# join HR_EMPLOYEES he on hg.EMP_NO = he.EMP_NO
# where YEAR = '2022'
# order by hg.SCORE desc

select sum(hg.SCORE) as SCORE ,he.EMP_NO,he.EMP_NAME,he.POSITION,he.EMAIL
from HR_GRADE hg
join HR_EMPLOYEES he on hg.EMP_NO = he.EMP_NO
where hg.YEAR = 2022
group by he.EMP_NO
order by SCORE desc
limit 1