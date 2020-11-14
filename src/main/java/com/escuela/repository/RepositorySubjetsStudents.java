package com.escuela.repository;

import com.escuela.models.SubjetStudent;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositorySubjetsStudents extends RepositoryGeneric<SubjetStudent> {

}
