package com.escuela.repository;

import com.escuela.models.CourseSubjectJoin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Interface.
 */
@Repository
public interface RepositoryCoursesSubjectsJoin extends RepositoryGeneric<CourseSubjectJoin> {
  
  @Query(value = "SELECT "
  +"courses_subjects.id,"
  +"courses.id AS `id_course`,"
  +"subjects.id AS `id_subject`,"
  +"courses.name AS `course_name`,"
  +"subjects.name AS `subject_name`,"
  +"courses_subjects.creation_date, "
  +"courses_subjects.update_date, "
  +"courses_subjects.created_by, "
  +"courses_subjects.updated_by "
  +"FROM subjects "
  +"INNER JOIN courses_subjects "
  +"ON subjects.id=courses_subjects.id_subject "
  +"INNER JOIN courses "
  +"ON courses.id=courses_subjects.id_course "
  +"WHERE courses_subjects.id_course = ?1", nativeQuery = true)
  Iterable<CourseSubjectJoin> findCourseSubjectJoin(Integer courseId);

  //Subjects Courses Join
  @Query(value = "SELECT "
  +"courses_subjects.id,"
  +"courses.id AS `id_course`,"
  +"subjects.id AS `id_subject`,"
  +"courses.name AS `course_name`,"
  +"subjects.name AS `subject_name`,"
  +"courses_subjects.creation_date, "
  +"courses_subjects.update_date, "
  +"courses_subjects.created_by, "
  +"courses_subjects.updated_by "
  +"FROM subjects "
  +"INNER JOIN courses_subjects "
  +"ON subjects.id=courses_subjects.id_subject "
  +"INNER JOIN courses "
  +"ON courses.id=courses_subjects.id_course "
  +"WHERE courses_subjects.id_subject = ?1", nativeQuery = true)
  Iterable<CourseSubjectJoin> findSubjectCourseJoin(Integer subjectId);
}
