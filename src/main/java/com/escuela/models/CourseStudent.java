package com.escuela.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
* Class.
*/
@Entity
@Table(name = "courses_students")
public class CourseStudent extends CourseStudentFather {

  /**
  * Constructor.
  */
  public CourseStudent() {
  }
}
