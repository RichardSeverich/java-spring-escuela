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
  private RepositorySubjets repositorySubjets;

  @Autowired
  private RepositoryCoursesStudents repositoryCoursesStudents;

  @Autowired
  private RepositoryCoursesStudents repositoryCoursesSubjets;

  @Autowired
  private RepositoryCoursesStudents repositorySubjetsStudents;

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
      case "subjet":
        return repositorySubjets;
      case "course_student":
        return repositoryCoursesStudents;
      case "course_subjet":
        return repositoryCoursesSubjets;
      case "subjet_student":
        return repositorySubjetsStudents;
      default:
        return repositoryUsers;
    }
  }
}
