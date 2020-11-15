package com.escuela.repository;

import com.escuela.models.Student;
import com.escuela.models.CourseStudentJoin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryStudents extends RepositoryGeneric<Student> {

}
