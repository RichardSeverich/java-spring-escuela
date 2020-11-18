package com.escuela.repository;

import com.escuela.models.Subject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositorySubjects extends RepositoryGeneric<Subject> {

    @Query(value = "SELECT subjects.* "
    +"FROM subjects "
    +"WHERE subjects.id "
    +"NOT IN ("
    +"SELECT courses_subjects.id_subject "
    +"FROM courses_subjects "
    +"WHERE courses_subjects.id_course = ?1)", nativeQuery = true)
    Iterable<Subject> findNoSubjectsByCourses(Integer courseId);
}
