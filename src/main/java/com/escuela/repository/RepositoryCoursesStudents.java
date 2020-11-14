package com.escuela.repository;

import com.escuela.models.CourseStudent;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryCoursesStudents extends RepositoryGeneric<CourseStudent> {

}
