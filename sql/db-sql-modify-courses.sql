--  DATA BASES MODIFY TABLE COURSES
ALTER TABLE courses ADD start_date DATE AFTER name;
ALTER TABLE courses ADD finish_date DATE AFTER start_date;

-- INSERT DATA FOR THE NEW COLUMNS
UPDATE courses SET start_date="2020-02-25" WHERE start_date=null;
UPDATE courses SET  finish_date="2020-10-25" WHERE finish_date=null;

UPDATE courses SET name="Satinador", start_date="2015-02-25", finish_date="2015-10-25" WHERE name="Satinador 2015";
UPDATE courses SET name="Satinador", start_date="2016-02-25", finish_date="2016-10-25" WHERE name="Satinador 2016";
UPDATE courses SET name="Satinador", start_date="2017-02-25", finish_date="2017-10-25" WHERE name="Satinador 2017";
UPDATE courses SET name="Satinador", start_date="2018-02-25", finish_date="2018-10-25" WHERE name="Satinador 2018";
UPDATE courses SET name="Satinador", start_date="2019-02-25", finish_date="2019-10-25" WHERE name="Satinador 2019";
UPDATE courses SET name="Satinador", start_date="2020-02-25", finish_date="2020-10-25" WHERE name="Satinador 2020";

UPDATE courses SET name="Condor", start_date="2015-02-25", finish_date="2015-10-25" WHERE name="Condor 2015";
UPDATE courses SET name="Condor", start_date="2016-02-25", finish_date="2016-10-25" WHERE name="Condor 2016";
UPDATE courses SET name="Condor", start_date="2017-02-25", finish_date="2017-10-25" WHERE name="Condor 2017";
UPDATE courses SET name="Condor", start_date="2018-02-25", finish_date="2018-10-25" WHERE name="Condor 2018";
UPDATE courses SET name="Condor", start_date="2019-02-25", finish_date="2019-10-25" WHERE name="Condor 2019";
UPDATE courses SET name="Condor", start_date="2020-02-25", finish_date="2020-10-25" WHERE name="Condor 2020";
