-- CREATE DATA BASES
CREATE DATABASE dbcondores;

-- DELETE DATA BASES
DROP DATABASE dbcondores;

-- SELECT ALL DATA: show all rows.
SELECT * FROM users;

-- DELETE ALL DATA: delete all rows
TRUNCATE TABLE users;

-- DELETE TABLE: detele the table.
DROP TABLE users;

-- DELETE SPECIFIC ROW.
DELETE FROM users WHERE id = 1000;
