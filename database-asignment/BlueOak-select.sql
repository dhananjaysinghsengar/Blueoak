select banking_id as 'Account Number', tx_amount as 'Received Amount',
  allocated_amount as 'Allocated Amount', tx_amount-allocated_amount as 'Unallocated Amount'
from
  (
select *
  from `blueoak-assignment
`.bbeng_banking_records
) x JOIN
(
select *, abs(sum(amount)) as 'allocated_amount'
from `blueoak
-assignment`.bbeng_banking_records_allocation
group by record_id
) y
on x.banking_id = y.record_id
where
(x.tx_amount-y.allocated_amount) > 0;


-- Query after performance consideration

SELECT banking_id AS 'Account Number', tx_amount AS 'Received Amount',
  allocated_amount AS 'Allocated Amount', tx_amount-allocated_amount AS 'Unallocated Amount'
FROM
  (
SELECT *
  FROM `blueoak-assignment
`.bbeng_banking_records WHERE tx_date BETWEEN '2020-06-04' AND '2020-06-05'
GROUP BY banking_id ORDER BY banking_id
) x JOIN
(
SELECT *, abs(sum(amount)) AS 'allocated_amount'
FROM `blueoak
-assignment`.bbeng_banking_records_allocation
WHERE record_id IN
(SELECT banking_id
FROM `blueoak
-assignment`.bbeng_banking_records WHERE tx_date BETWEEN '2020-06-04' AND '2020-06-05'
GROUP BY banking_id ORDER BY banking_id)
GROUP BY record_id ORDER BY record_id
) y
ON x.banking_id = y.record_id
WHERE
(x.tx_amount-y.allocated_amount) > 0;