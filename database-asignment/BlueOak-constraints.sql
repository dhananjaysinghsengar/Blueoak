ALTER TABLE `blueoak-assignment`.bbeng_banking_records
ADD CONSTRAINT `FK_yai6jdjf3xexig7a9vd63aau`
FOREIGN KEY
(`banking_id`) REFERENCES `blueoak-assignment`.bbeng_account_details
(`account_number`);

ALTER TABLE `blueoak-assignment`.bbeng_banking_records_allocation
ADD CONSTRAINT `FK_bcco5xgknxil7sfpswhp1atxb`
FOREIGN KEY
(`record_id`) REFERENCES `blueoak-assignment`.bbeng_banking_records
(`banking_id`);


-- Target table in constraint does not have any table definition in problem statement
ALTER TABLE `blueoak-assignment`.bbeng_banking_records_allocation
ADD CONSTRAINT `FK_trtr1vyge3deqhpvbpyxynq78`
FOREIGN KEY
(`account_id`) REFERENCES `blueoak-assignment`.bbeng_account_details
(`account_number`);


-- Index addition for performance improvement
CREATE INDEX i_o_banking_id ON `
blueoak-assignment`.bbeng_banking_records
(banking_id);
CREATE INDEX i_o_tx_date ON `
blueoak-assignment`.bbeng_banking_records
(tx_date);

CREATE INDEX i_o_record_id ON `
blueoak-assignment`.bbeng_banking_records_allocation
(record_id);
CREATE INDEX i_o_tx_date ON `
blueoak-assignment`.bbeng_banking_records_allocation
(tx_date);
