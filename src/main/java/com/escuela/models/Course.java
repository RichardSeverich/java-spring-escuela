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
@Table(name = "courses")
@Getter
@Setter
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.ONE_HUNDRED_TWENTY)
  @Column(name = "name")
  private String name;

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
  public Course() {
  }
}
