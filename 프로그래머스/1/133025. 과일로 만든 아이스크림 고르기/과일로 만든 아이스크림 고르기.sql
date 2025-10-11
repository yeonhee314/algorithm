SELECT h.flavor
FROM FIRST_HALF as h inner join ICECREAM_INFO as i 
ON h.flavor = i.flavor
where h.total_order > 3000 AND INGREDIENT_TYPE = 'fruit_based'
order by h.total_order desc