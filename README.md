# asa

# (The application is running on mysql. H2 was throwing a config error.)
# also find the mysql version of the DB shared as a script:asa_assessment.sql

# Clone the repo from https://github.com/nnyanyirai/asa.git
#  QUESTIONS
=========================================
# Import Postman collection file shared to answer the following questions
# 1. Display transactional accounts with balances
# 2. Display currency accounts with converted Rand values
# 3. Withdraw (Calculation of notes to be dispensed)

# 4.Reporting – Find the transactional account per client with the highest balance
# run following query:
# SELECT CLIENT_ID,a.CLIENT_ACCOUNT_NUMBER,t.DESCRIPTION,a.DISPLAY_BALANCE 
# FROM asa_assessment.CLIENT_ACCOUNT a join asa_assessment.ACCOUNT_TYPE t 
# ON a.ACCOUNT_TYPE_CODE=t.ACCOUNT_TYPE_CODE  ORDER by a.DISPLAY_BALANCE DESC


#5 Reporting – Calculate aggregate financial position per client
# run following query:
# SELECT
# CONCAT(C.TITLE," ",C.NAME," ",C.SURNAME) AS CLIENT,
# SUM(IF(ACCOUNT_TYPE_CODE = 'PLOAN' or 'HLOAN', DISPLAY_BALANCE, 0)) AS `LOAN BALANCE`,
# SUM(IF(ACCOUNT_TYPE_CODE = 'SVGS' or 'CHQ' or 'SVGS' or 'CCRD', DISPLAY_BALANCE, 0)) AS `TRANSACTIONAL BALANCE`,
# SUM(IF(ACCOUNT_TYPE_CODE = 'SVGS' or 'CHQ' or 'SVGS' or 'CCRD', DISPLAY_BALANCE, 0))-(IF(ACCOUNT_TYPE_CODE = 'PLOAN' or 'HLOAN', DISPLAY_BALANCE, 0)) AS `NET POSITION`
# FROM
# CLIENT_ACCOUNT A JOIN CLIENT C ON A.CLIENT_ID=C.CLIENT_ID
# GROUP BY
# NAME;

# alternatively get queries from a txt file named Queries shared.

# test data can be imported as the original file shared.