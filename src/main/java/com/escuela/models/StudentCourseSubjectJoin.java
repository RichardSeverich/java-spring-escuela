package com.escuela.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
* Class.
*/
@Entity
@Getter
@Setter
public class StudentCourseSubjectJoin extends CourseSubjectFather {

  @Column(name = "course_name")
  private String courseName;

  @Column(name = "subject_name")
  private String subjectName;

  @Column(name = "subject_score")
  private String subjectScore;

  /**
  * Constructor.
  */
  public StudentCourseSubjectJoin() {
  }
}
