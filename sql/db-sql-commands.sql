-- CREATE DATA BASES
CREATE DATABASE dbescuela;

-- DELETE DATA BASES
DROP DATABASE dbescuela;

-- SELECT ALL DATA: show all rows.
SELECT * FROM users;

-- DELETE ALL DATA: delete all rows
TRUNCATE TABLE users;

-- DELETE TABLE: detele the table.
DROP TABLE users;

-- DELETE SPECIFIC ROW.
DELETE FROM users WHERE id = 1000;

-- INNER JOIN COURSES AND STUDENTS
SELECT
courses_students.id,
courses.id AS `course_id`,
students.id AS `student_id`,
courses.name AS `course_name`,
students.dni,
students.name AS `student_name`,
students.father_last_name,
students.mother_last_name,  
students.yunta, 
students.grade, 
students.weapon, 
students.promo,
courses_students.creation_date, 
courses_students.update_date, 
courses_students.created_by, 
courses_students.updated_by
FROM students
INNER JOIN courses_students
ON students.id=courses_students.id_student
INNER JOIN courses
ON courses.id=courses_students.id_course
WHERE courses_students.id_course = 1003;

-- INNER JOIN COURSES AND SUBJETS
SELECT
courses_subjets.id,
courses.id AS `course_id`,
subjets.id AS `subjet_id`,
courses.name AS `course_name`,
subjets.name AS `subjet_name`,
courses_subjets.creation_date, 
courses_subjets.update_date, 
courses_subjets.created_by, 
courses_subjets.updated_by
FROM subjets
INNER JOIN courses_subjets
ON subjets.id=courses_subjets.id_subjet
INNER JOIN courses
ON courses.id=courses_subjets.id_course
WHERE courses_subjets.id_course = 1003;

-- INNER JOIN SUBJETS STUDENTS ALL COURSES 1 STUDENT
SELECT 
subjets_students.id,
subjets.id AS `subjet_id`,
students.id AS `student_id`,
students.dni,
students.name,
students.father_last_name,
students.mother_last_name,  
students.yunta, 
students.grade, 
students.weapon, 
students.promo, 
subjets.name AS `subject_name`,
subjets_students.score, 
subjets_students.creation_date, 
subjets_students.update_date, 
subjets_students.created_by, 
subjets_students.updated_by
FROM students
INNER JOIN subjets_students
ON students.id=subjets_students.id_student
INNER JOIN subjets
ON subjets.id=subjets_students.id_subjet
WHERE subjets_students.id_student=1000;

-- INNER JOIN SUBJETS STUDENTS 1 COURSE 1 STUDENT
SELECT 
subjets_students.id,
subjets.id AS `subjet_id`,
students.id AS `student_id`,
students.dni,
students.name,
students.father_last_name,
students.mother_last_name,  
students.yunta, 
students.grade, 
students.weapon, 
students.promo, 
subjets.name AS `subject_name`,
subjets_students.score, 
subjets_students.creation_date, 
subjets_students.update_date, 
subjets_students.created_by, 
subjets_students.updated_by
FROM students
INNER JOIN subjets_students
ON students.id=subjets_students.id_student
INNER JOIN subjets
ON subjets.id=subjets_students.id_subjet
INNER JOIN courses_subjets
ON courses_subjets.id_subjet=subjets_students.id_subjet
WHERE subjets_students.id_student=1000 AND courses_subjets.id_course=1003;

-- INNER JOIN SUBJETS STUDENTS 1 COURSE ALL STUDENTS
SELECT 
subjets_students.id,
subjets.id AS `subjet_id`,
students.id AS `student_id`,
students.dni,
students.name,
students.father_last_name,
students.mother_last_name,  
students.yunta, 
students.grade, 
students.weapon, 
students.promo, 
subjets.name AS `subject_name`,
subjets_students.score, 
subjets_students.creation_date, 
subjets_students.update_date, 
subjets_students.created_by, 
subjets_students.updated_by
FROM students
INNER JOIN subjets_students
ON students.id=subjets_students.id_student
INNER JOIN subjets
ON subjets.id=subjets_students.id_subjet
INNER JOIN courses_subjets
ON courses_subjets.id_subjet=subjets_students.id_subjet
WHERE courses_subjets.id_course=1003;

-- INNER JOIN GENERIC
SELECT nombreColumna(s)
FROM tabla1
INNER JOIN tabla2
ON tabla1.nombreColumna = table2.nombreColumna;
