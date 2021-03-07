package com.escuela.models;

import com.escuela.support.Magic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
* Class.
*/
@Entity
@Table(name = "subjects_students")
public class SubjectStudent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @Getter @Setter
  private Integer id;

  @NotNull
  @Column(name = "id_subject")
  @Getter @Setter
  private Integer idSubject;

  @NotNull
  @Column(name = "id_student")
  @Getter @Setter
  private Integer idStudent;

  @NotNull
  @Size(min = Magic.ONE, max = Magic.TRHEE)
  @Column(name = "score")
  @Getter @Setter
  private String score;

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
  public SubjectStudent() {
  }
}
