package com.escuela.repository;

import com.escuela.models.StudentSubjectJoin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryStudentsSubjectsJoin extends RepositoryGeneric<StudentSubjectJoin> {
  
  @Query(value = "SELECT "
  +"subjects_students.id,"
  +"subjects.id AS `id_subject`,"
  +"students.id AS `id_student`,"
  +"students.dni AS `student_dni`,"
  +"students.name AS `student_name`,"
  +"students.father_last_name AS `student_father_last_name`,"
  +"students.mother_last_name AS `student_mother_last_name`,"
  +"students.yunta AS `student_yunta`,"
  +"students.grade AS `student_grade`,"
  +"students.weapon AS `student_weapon`,"
  +"students.promo AS `student_promo`,"
  +"subjects.name AS `subject_name`,"
  +"subjects_students.score AS `subject_score`,"
  +"subjects_students.creation_date, "
  +"subjects_students.update_date,"
  +"subjects_students.created_by, "
  +"subjects_students.updated_by "
  +"FROM students "
  +"INNER JOIN subjects_students "
  +"ON students.id=subjects_students.id_student "
  +"INNER JOIN subjects "
  +"ON subjects.id=subjects_students.id_subject "
  +"WHERE subjects_students.id_student= ?1", nativeQuery = true)
  Iterable<StudentSubjectJoin> findStudentSubjectJoin(Integer studentId);
}
