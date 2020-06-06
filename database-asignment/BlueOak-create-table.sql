CREATE TABLE `bbeng_banking_records`
( 

  `id` int
(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'entity id', 

  `banking_id` int
(5) unsigned NOT NULL COMMENT 'foreign key to the banking details', #

  `tx_date` date NOT NULL COMMENT 'date the transaction took place', 

  `settlement_date` date NOT NULL COMMENT 'date the settlement of the transaction took place', 

  `tx_amount` decimal
(12,2) NOT NULL COMMENT 'transaction amount (-ve=DR, +ve=CR)', 

`tx_channel` enum
('UNKNOWN','BPAY','POSTBILLPAY','INTERNET','PHONE','EFT','DIRECT_DEBIT','MAIL')  NOT NULL COMMENT 'channel on which the transaction occurred', 

  PRIMARY KEY
(`id`), 

  KEY `FK_yai6jdjf3xexig7a9vd63aau`
(`banking_id`)#, 

 # CONSTRAINT `FK_yai6jdjf3xexig7a9vd63aau`  

#FOREIGN KEY
(`banking_id`) REFERENCES `bbeng_billers_banking`
(`id`) 

) ENGINE=InnoDB AUTO_INCREMENT=1;


DROP TABLE IF EXISTS `bbeng_banking_records_allocation`;

CREATE TABLE `bbeng_banking_records_allocation`
( 

  `id` int
(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'entity id', 

  `record_id` int
(10) unsigned NOT NULL  

COMMENT 'banking record to which allocation belongs', 

  `account_id` int
(10) unsigned NOT NULL  

COMMENT 'foreign key to the account entity', 

  `amount` decimal
(12,2) NOT NULL COMMENT 'amount that was allocated', 

  PRIMARY KEY
(`id`), 

  KEY `FK_trtr1vyge3deqhpvbpyxynq78`
(`account_id`), 

  KEY `FK_bcco5xgknxil7sfpswhp1atxb`
(`record_id`)#, 

#  CONSTRAINT `FK_bcco5xgknxil7sfpswhp1atxb`  

#FOREIGN KEY
(`record_id`) REFERENCES `bbeng_banking_records`
(`id`), 

#  CONSTRAINT `FK_trtr1vyge3deqhpvbpyxynq78`  

#FOREIGN KEY
(`account_id`) REFERENCES `bbeng_account_details`
(`id`) 

) ENGINE=InnoDB AUTO_INCREMENT=1;


DROP TABLE IF EXISTS `bbeng_account_details`;

CREATE TABLE `bbeng_account_details`
( 

  `id` int
(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'entity id', 

  `account_number` int
(12) unsigned NOT NULL COMMENT 'Account Number', 
  
  PRIMARY KEY
(`id`),
  UNIQUE KEY
(`account_number`)

) ENGINE=InnoDB AUTO_INCREMENT=1;