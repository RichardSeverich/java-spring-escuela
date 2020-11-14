package com.escuela.repository;

import com.escuela.models.CourseSubjet;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryCoursesSubjets extends RepositoryGeneric<CourseSubjet> {

}
