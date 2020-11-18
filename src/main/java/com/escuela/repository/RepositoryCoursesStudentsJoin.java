package com.escuela.repository;

import com.escuela.models.CourseStudentJoin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryCoursesStudentsJoin extends RepositoryGeneric<CourseStudentJoin> {

  @Query(value = "SELECT "
      + "courses_students.id,"
      + "courses.id AS `id_course`,"
      + "students.id AS `id_student`,"
      + "courses.name AS `course_name`,"
      + "students.dni AS `student_dni`,"
      + "students.name AS `student_name`,"
      + "students.father_last_name AS `student_father_last_name`,"
      + "students.mother_last_name AS `student_mother_last_name`,"
      + "students.yunta AS `student_yunta`,"
      + "students.grade AS `student_grade`,"
      + "students.weapon AS `student_weapon`,"
      + "students.promo AS `student_promo`,"
      + "courses_students.creation_date,"
      + "courses_students.update_date,"
      + "courses_students.created_by,"
      + "courses_students.updated_by "
      + "FROM students "
      + "INNER JOIN courses_students "
      + "ON students.id=courses_students.id_student "
      + "INNER JOIN courses "
      + "ON courses.id=courses_students.id_course "
      + "WHERE courses_students.id_course = ?1", nativeQuery = true)
  Iterable<CourseStudentJoin> findCourseStudentJoin(Integer courseId);
}
