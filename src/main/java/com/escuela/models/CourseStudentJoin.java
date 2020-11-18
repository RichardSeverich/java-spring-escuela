package com.escuela.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
* Class.
*/
@Entity
//@Table(name = "courses_students_join")
public class CourseStudentJoin {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @Getter @Setter
  private Integer id;

  @Column(name = "id_course")
  @Getter @Setter
  private Integer idCourse;

  @Column(name = "id_student")
  @Getter @Setter
  private Integer idStudent;

  @Column(name = "course_name")
  @Getter @Setter
  private String courseName;

  @Column(name = "student_dni")
  @Getter @Setter
  private String studentDni;

  @Column(name = "student_name")
  @Getter @Setter
  private String studentName;

  @Column(name = "student_father_last_name")
  @Getter @Setter
  private String studentFatherLastName;

  @Column(name = "student_mother_last_name")
  @Getter @Setter
  private String studentMotherLastName;

  @Column(name = "student_yunta")
  @Getter @Setter
  private String studentYunta;

  @Column(name = "student_grade")
  @Getter @Setter
  private String studentGrade;

  @Column(name = "student_weapon")
  @Getter @Setter
  private String studentWeapon;

  @Column(name = "student_promo")
  @Getter @Setter
  private String studentPromo;

  @Column(name = "creation_date", insertable = false, updatable = false)
  @Getter @Setter
  private String creationDate;

  @Column(name = "update_date", insertable = false, updatable = false)
  @Getter @Setter
  private String updateDate;

  @Column(name = "created_by", updatable = false)
  @Getter @Setter
  private String createdBy;

  @Column(name = "updated_by", insertable = false)
  @Getter @Setter
  private String updatedBy;

  /**
  * Constructor.
  */
  public CourseStudentJoin() {
  }
}
