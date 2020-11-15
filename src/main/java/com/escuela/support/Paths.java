package com.escuela.support;

/**
* Constants Paths utility class.
*/
public final class Paths {

  private static final String VERSION = "/api/v1";
  private static final String USER = "/users";
  private static final String STUDENT = "/students";
  private static final String COURSE = "/courses";
  private static final String SUBJECT = "/subjects";
  private static final String COURSES_STUDENTS = "/courses-students";
  private static final String COURSES_SUBJECTS = "/courses-subjects";
  private static final String SUBJECTS_STUDENTS = "/subjects-students";
  private static final String LOGIN = "/login";
  private static final String ID = "/{id}";
  // Login
  public static final String PATH_LOGIN = VERSION + LOGIN;
  // Users
  public static final String PATH_USERS = VERSION + USER;
  public static final String PATH_USERS_WITH_ID = PATH_USERS + ID;
  // Students
  public static final String PATH_STUDENTS = VERSION + STUDENT;
  public static final String PATH_STUDENTS_WITH_ID = PATH_STUDENTS + ID;
  // Courses
  public static final String PATH_COURSES = VERSION + COURSE;
  public static final String PATH_COURSES_WITH_ID = PATH_COURSES + ID;
  // Courses
  public static final String PATH_SUBJECTS = VERSION + SUBJECT;
  public static final String PATH_SUBJECTS_WITH_ID = PATH_SUBJECTS + ID;
  //Courses Students
  public static final String PATH_COURSES_STUDENTS = VERSION + COURSES_STUDENTS;
  public static final String PATH_COURSES_STUDENTS_WITH_ID = PATH_COURSES_STUDENTS + ID;
  //Courses Subjects
  public static final String PATH_COURSES_SUBJECTS = VERSION + COURSES_SUBJECTS;
  public static final String PATH_COURSES_SUBJECTS_WITH_ID = PATH_COURSES_SUBJECTS + ID;
  //Subjects Students
  public static final String PATH_SUBJECTS_STUDENTS = VERSION + SUBJECTS_STUDENTS;
  public static final String PATH_SUBJECTS_STUDENTS_WITH_ID = PATH_SUBJECTS_STUDENTS + ID;
  //Subjects Students
  public static final String PATH_COURSES_STUDENTS_JOIN = PATH_COURSES_WITH_ID + STUDENT;

  /**
  * Private constructor for utility class.
  */
  private Paths() {

  }
}
