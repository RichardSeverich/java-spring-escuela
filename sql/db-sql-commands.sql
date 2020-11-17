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

-- INNER JOIN 1 COURSES ALL STUDENTS
SELECT
courses_students.id,
courses.id AS `id_course`,
students.id AS `id_student`,
courses.name AS `course_name`,
students.dni AS `student_dni`,
students.name AS `student_name`,
students.father_last_name AS `student_father_last_name`,
students.mother_last_name AS `student_mother_last_name`,  
students.yunta AS `student_yunta`,
students.grade AS `student_grade`,
students.weapon AS `student_weapon`,
students.promo AS `student_promo`,
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

-- INNER JOIN 1 STUDENTS ALL COURSES
SELECT
courses_students.id,
courses.id AS `id_course`,
students.id AS `id_student`,
courses.name AS `course_name`,
students.dni AS `student_dni`,
students.name AS `student_name`,
students.father_last_name AS `student_father_last_name`,
students.mother_last_name AS `student_mother_last_name`,  
students.yunta AS `student_yunta`,
students.grade AS `student_grade`,
students.weapon AS `student_weapon`,
students.promo AS `student_promo`,
courses_students.creation_date, 
courses_students.update_date, 
courses_students.created_by, 
courses_students.updated_by
FROM students
INNER JOIN courses_students
ON students.id=courses_students.id_student
INNER JOIN courses
ON courses.id=courses_students.id_course
WHERE courses_students.id_student = 1001;

-- 1 STUDENT ALL COURSES NOT SUBSCRIBE
SELECT courses.*
  FROM courses
  WHERE courses.id
  NOT IN 
  (SELECT 
    courses_students.id_course 
    FROM courses_students 
    WHERE courses_students.id_student = '1000');

-- INNER JOIN 1 COURSES ALL SUBJECTS
SELECT
courses_subjects.id,
courses.id AS `id_course`,
subjects.id AS `id_subject`,
courses.name AS `course_name`,
subjects.name AS `subject_name`,
courses_subjects.creation_date, 
courses_subjects.update_date, 
courses_subjects.created_by, 
courses_subjects.updated_by
FROM subjects
INNER JOIN courses_subjects
ON subjects.id=courses_subjects.id_subject
INNER JOIN courses
ON courses.id=courses_subjects.id_course
WHERE courses_subjects.id_course = 1003;

-- INNER JOIN 1 STUDENTS ALL SUBJECTS 
SELECT 
subjects_students.id,
subjects.id AS `id_subject`,
students.id AS `id_student`,
students.dni AS `student_dni`,
students.name AS `student_name`,
students.father_last_name AS `student_father_last_name`,
students.mother_last_name AS `student_mother_last_name`, 
students.yunta AS `student_yunta`,
students.grade AS `student_grade`, 
students.weapon AS `student_weapon`, 
students.promo AS `student_promo`, 
subjects.name AS `subject_name`,
subjects_students.score AS `subject_score`, 
subjects_students.creation_date, 
subjects_students.update_date, 
subjects_students.created_by, 
subjects_students.updated_by
FROM students
INNER JOIN subjects_students
ON students.id=subjects_students.id_student
INNER JOIN subjects
ON subjects.id=subjects_students.id_subject
WHERE subjects_students.id_student=1000;

-- INNER JOIN 1 SUBJECTS ALL STUDENTS 
SELECT 
subjects_students.id,
subjects.id AS `id_subject`,
students.id AS `id_student`,
students.dni AS `student_dni`,
students.name AS `student_name`,
students.father_last_name AS `student_father_last_name`,
students.mother_last_name AS `student_mother_last_name`, 
students.yunta AS `student_yunta`,
students.grade AS `student_grade`, 
students.weapon AS `student_weapon`, 
students.promo AS `student_promo`, 
subjects.name AS `subject_name`,
subjects_students.score AS `subject_score`, 
subjects_students.creation_date, 
subjects_students.update_date, 
subjects_students.created_by, 
subjects_students.updated_by
FROM students
INNER JOIN subjects_students
ON students.id=subjects_students.id_student
INNER JOIN subjects
ON subjects.id=subjects_students.id_subject
WHERE subjects_students.id_subject=1000;

-- INNER JOIN 1 SUBJECT ALL COURSES
SELECT
courses_subjects.id,
courses.id AS `id_course`,
subjects.id AS `id_subject`,
courses.name AS `course_name`,
subjects.name AS `subject_name`,
courses_subjects.creation_date, 
courses_subjects.update_date, 
courses_subjects.created_by, 
courses_subjects.updated_by
FROM subjects
INNER JOIN courses_subjects
ON subjects.id=courses_subjects.id_subject
INNER JOIN courses
ON courses.id=courses_subjects.id_course
WHERE courses_subjects.id_subject = 1003;

-- INNER JOIN SUBJECTS STUDENTS 1 COURSE 1 STUDENT
SELECT 
subjects_students.id,
subjects.id AS `id_subject`,
students.id AS `id_student`,
students.dni,
students.name,
students.father_last_name,
students.mother_last_name,  
students.yunta, 
students.grade, 
students.weapon, 
students.promo, 
subjects.name AS `subject_name`,
subjects_students.score, 
subjects_students.creation_date, 
subjects_students.update_date, 
subjects_students.created_by, 
subjects_students.updated_by
FROM students
INNER JOIN subjects_students
ON students.id=subjects_students.id_student
INNER JOIN subjects
ON subjects.id=subjects_students.id_subject
INNER JOIN courses_subjects
ON courses_subjects.id_subject=subjects_students.id_subject
WHERE subjects_students.id_student=1000 AND courses_subjects.id_course=1003;

-- INNER JOIN SUBJECTS STUDENTS 1 COURSE ALL STUDENTS
SELECT 
subjects_students.id,
subjects.id AS `id_subject`,
students.id AS `id_student`,
students.dni,
students.name,
students.father_last_name,
students.mother_last_name,  
students.yunta, 
students.grade, 
students.weapon, 
students.promo, 
subjects.name AS `subject_name`,
subjects_students.score, 
subjects_students.creation_date, 
subjects_students.update_date, 
subjects_students.created_by, 
subjects_students.updated_by
FROM students
INNER JOIN subjects_students
ON students.id=subjects_students.id_student
INNER JOIN subjects
ON subjects.id=subjects_students.id_subject
INNER JOIN courses_subjects
ON courses_subjects.id_subject=subjects_students.id_subject
WHERE courses_subjects.id_course=1003;

-- INNER JOIN GENERIC
SELECT nombreColumna(s)
FROM tabla1
INNER JOIN tabla2
ON tabla1.nombreColumna = table2.nombreColumna;
