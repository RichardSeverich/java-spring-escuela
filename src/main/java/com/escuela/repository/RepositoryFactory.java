package com.escuela.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryFactory {

  @Autowired
  private RepositoryUsers repositoryUsers;

  @Autowired
  private RepositoryStudents repositoryStudents;

  @Autowired
  private RepositoryCourses repositoryCourses;

  @Autowired
  private RepositorySubjects repositorySubjects;

  @Autowired
  private RepositoryCoursesStudents repositoryCoursesStudents;

  @Autowired
  private RepositoryCoursesSubjects repositoryCoursesSubjects;

  @Autowired
  private RepositorySubjectsStudents repositorySubjectsStudents;

  /**
   *.
   * @param entityName.
   * @return JpaRepository.
   */
  public JpaRepository getRepository(String entityName) {
    switch (entityName) {
      case "user":
        return repositoryUsers;
      case "student":
        return repositoryStudents;
      case "course":
        return repositoryCourses;
      case "subject":
        return repositorySubjects;
      case "course_student":
        return repositoryCoursesStudents;
      case "course_subject":
        return repositoryCoursesSubjects;
      case "subject_student":
        return repositorySubjectsStudents;
      default:
        return repositoryUsers;
    }
  }
}
