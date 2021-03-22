package com.escuela.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
* Class.
*/
@Entity
@Table(name = "subjects_students")
public class SubjectStudent extends SubjectStudentFather {

  /**
  * Constructor.
  */
  public SubjectStudent() {
  }
}
