package com.escuela.models;

import com.escuela.support.Magic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
* Class.
*/
@Entity
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  @Getter @Setter
  private Integer id;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.TEN)
  @Column(name = "dni")
  @Getter @Setter
  private String dni;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "name")
  @Getter @Setter
  private String name;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "father_last_name")
  @Getter @Setter
  private String fatherLastName;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "mother_last_name")
  @Getter @Setter
  private String motherLastName;

  @NotNull
  @Size(min = Magic.TEN, max = Magic.TEN)
  @Pattern(regexp = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))")
  @Column(name = "birth_date")
  @Getter @Setter
  private String birthDate;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "telephone")
  @Getter @Setter
  private String telephone;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.SIXTY)
  @Column(name = "address")
  @Getter @Setter
  private String address;

  @NotNull
  @Size(min = Magic.SEVEN, max = Magic.THIRTY)
  @Pattern(regexp = "^([a-zA-Z0-9_\\-.]+)@([a-zA-Z0-9_\\-.]+)\\.([a-zA-Z]{2,5})$")
  @Column(name = "email")
  @Getter @Setter
  private String email;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "yunta")
  @Getter @Setter
  private String yunta;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "grade")
  @Getter @Setter
  private String grade;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "weapon")
  @Getter @Setter
  private String weapon;

  @NotNull
  @Size(min = Magic.TRHEE, max = Magic.THIRTY)
  @Column(name = "promo")
  @Getter @Setter
  private String promo;

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
  public Student() {
  }
}
