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
public class CourseStudentJoin extends CourseStudentFather {

  @Column(name = "course_name")
  private String courseName;

  @Column(name = "student_dni")
  private String studentDni;

  @Column(name = "student_name")
  private String studentName;

  @Column(name = "student_father_last_name")
  private String studentFatherLastName;

  @Column(name = "student_mother_last_name")
  private String studentMotherLastName;

  @Column(name = "student_yunta")
  private String studentYunta;

  @Column(name = "student_grade")
  private String studentGrade;

  @Column(name = "student_weapon")
  private String studentWeapon;

  @Column(name = "student_promo")
  private String studentPromo;

  /**
  * Constructor.
  */
  public CourseStudentJoin() {
  }
}
