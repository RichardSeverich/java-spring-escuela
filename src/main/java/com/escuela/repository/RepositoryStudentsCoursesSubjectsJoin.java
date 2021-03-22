package com.escuela.repository;

import com.escuela.models.StudentCourseSubjectJoin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryStudentsCoursesSubjectsJoin
    extends RepositoryGeneric<StudentCourseSubjectJoin> {

  @Query(value = "SELECT "
      + "subjects_students.id,"
      + "courses_subjects.id_course,"
      + "courses_subjects.id_subject,"
      + "courses.name AS `course_name`,"
      + "subjects.name AS `subject_name`,"
      + "subjects_students.score AS `subject_score`,"
      + "subjects_students.creation_date, "
      + "subjects_students.update_date,"
      + "subjects_students.created_by, "
      + "subjects_students.updated_by "
      + "FROM courses_subjects "
      + "INNER JOIN courses_students "
      + "ON courses_subjects.id_course=courses_students.id_course "
      + "INNER JOIN subjects_students "
      + "ON subjects_students.id_student=courses_students.id_student "
      + "AND subjects_students.id_subject= courses_subjects.id_subject "
      + "INNER JOIN courses "
      + "ON courses_students.id_course=courses.id "
      + "INNER JOIN subjects "
      + "ON subjects_students.id_subject=subjects.id "
      + "WHERE courses_students.id_student = ?1", nativeQuery = true)
  Iterable<StudentCourseSubjectJoin> findStudentCourseSubjectJoin(Integer studentId);
}
