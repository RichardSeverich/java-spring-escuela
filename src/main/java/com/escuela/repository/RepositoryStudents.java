package com.escuela.repository;

import com.escuela.models.Student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryStudents extends RepositoryGeneric<Student> {

  @Query(value = "SELECT students.* "
  +"FROM students "
  +"WHERE students.id "
  +"NOT IN ("
  +"SELECT courses_students.id_student "
  +"FROM courses_students "
  +"WHERE courses_students.id_course = ?1)", nativeQuery = true)
  Iterable<Student> findNoStudentsByCourse(Integer courseId);

}
