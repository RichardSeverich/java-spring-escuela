package com.escuela.repository;

import com.escuela.models.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryCourses extends RepositoryGeneric<Course> {

   
    @Query(value = "SELECT courses.* "
    +"FROM courses "
    +"WHERE courses.id "
    +"NOT IN ("
    +"SELECT courses_students.id_course "
    +"FROM courses_students "
    +"WHERE courses_students.id_student = ?1 )", nativeQuery = true)
    Iterable<Course> findNoCoursesByStudent(Integer studentId);

    
    @Query(value = "SELECT courses.* "
    +"FROM courses "
    +"WHERE courses.id "
    +"NOT IN ("
    +"SELECT courses_subjects.id_course " 
    +"FROM courses_subjects " 
    +"WHERE courses_subjects.id_subject = ?1 )", nativeQuery = true)
    Iterable<Course> findNoCoursesBySubject(Integer subjectId);
}
