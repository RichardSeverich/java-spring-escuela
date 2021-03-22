package com.escuela.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
* Class.
*/
@Entity
@Table(name = "courses_subjects")
public class CourseSubject extends CourseSubjectFather {

  /**
  * Constructor.
  */
  public CourseSubject() {
  }
}
