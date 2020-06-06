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
