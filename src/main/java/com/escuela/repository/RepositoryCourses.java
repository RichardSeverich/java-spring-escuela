package com.escuela.repository;

import com.escuela.models.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryCourses extends RepositoryGeneric<Course> {

}
