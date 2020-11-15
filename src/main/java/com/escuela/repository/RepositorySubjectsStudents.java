package com.escuela.repository;

import com.escuela.models.SubjectStudent;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositorySubjectsStudents extends RepositoryGeneric<SubjectStudent> {

}
