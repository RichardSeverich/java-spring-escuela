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
@Getter
@Setter
public class StudentSubjectJoin {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "id_subject")
  private Integer idSubject;

  @Column(name = "id_student")
  private Integer idStudent;

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

  @Column(name = "subject_name")
  private String subjectName;

  @Column(name = "subject_score")
  private String subjectScore;

  @Column(name = "creation_date", insertable = false, updatable = false)
  private String creationDate;

  @Column(name = "update_date", insertable = false, updatable = false)
  private String updateDate;

  @Column(name = "created_by", updatable = false)
  private String createdBy;

  @Column(name = "updated_by", insertable = false)
  private String updatedBy;

  /**
  * Constructor.
  */
  public StudentSubjectJoin() {
  }
}
