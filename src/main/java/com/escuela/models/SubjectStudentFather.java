package com.escuela.models;

import com.escuela.support.Magic;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
* Class.
*/
@MappedSuperclass
@Getter
@Setter
public class SubjectStudentFather {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @NotNull
  @Column(name = "id_subject")
  private Integer idSubject;

  @NotNull
  @Column(name = "id_student")
  private Integer idStudent;

  @NotNull
  @Size(min = Magic.ONE, max = Magic.TRHEE)
  @Column(name = "score")
  private String score;

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
  public SubjectStudentFather() {
  }
}
