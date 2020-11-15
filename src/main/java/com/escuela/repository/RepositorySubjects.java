package com.escuela.repository;

import com.escuela.models.Subject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositorySubjects extends RepositoryGeneric<Subject> {

}
