package com.escuela.support;

/**
* Constants Paths utility class.
*/
public final class Paths {

  private static final String VERSION = "/api/v1";
  private static final String USER = "/users";
  private static final String STUDENT = "/students";
  private static final String COURSE = "/courses";
  private static final String SUBJET = "/subjets";
  private static final String COURSES_STUDENTS = "/courses_students";
  private static final String COURSES_SUBJETS = "/courses_subjets";
  private static final String SUBJETS_STUDENTS = "/subjets_students";
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
  public static final String PATH_SUBJETS = VERSION + SUBJET;
  public static final String PATH_SUBJETS_WITH_ID = PATH_SUBJETS + ID;
  //Courses Students
  public static final String PATH_COURSES_STUDENTS = VERSION + COURSES_STUDENTS;
  public static final String PATH_COURSES_STUDENTS_WITH_ID = PATH_COURSES_STUDENTS + ID;
  //Courses Subjets
  public static final String PATH_COURSES_SUBJETS = VERSION + COURSES_SUBJETS;
  public static final String PATH_COURSES_SUBJETS_WITH_ID = PATH_COURSES_SUBJETS + ID;
  //Subjets Students
  public static final String PATH_SUBJETS_STUDENTS = VERSION + SUBJETS_STUDENTS;
  public static final String PATH_SUBJETS_STUDENTS_WITH_ID = PATH_SUBJETS_STUDENTS + ID;
  /**
  * Private constructor for utility class.
  */
  private Paths() {

  }
}
