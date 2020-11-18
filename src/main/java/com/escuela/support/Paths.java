package com.escuela.support;

/**
* Constants Paths utility class.
*/
public final class Paths {

  private static final String VERSION = "/api/v1";
  private static final String USER = "/users";
  private static final String STUDENT = "/students";
  private static final String NO_COURSES = "/no-courses";
  private static final String NO_STUDENTS = "/no-students";
  private static final String NO_SUBJECTS = "/no-subjects";
  private static final String COURSE = "/courses";
  private static final String SUBJECT = "/subjects";
  private static final String COURSES_STUDENTS = "/courses-students";
  private static final String COURSES_SUBJECTS = "/courses-subjects";
  private static final String SUBJECTS_STUDENTS = "/subjects-students";
  private static final String LOGIN = "/login";
  private static final String ID = "/{id}";
  private static final String ID_AUX = "/{aux}";
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
  //Courses Students Join
  public static final String PATH_COURSES_STUDENTS_JOIN = PATH_COURSES_WITH_ID + STUDENT;
  //Courses Subjects Join
  public static final String PATH_COURSES_SUBJECTS_JOIN = PATH_COURSES_WITH_ID + SUBJECT;
  //Students Courses Join
  public static final String PATH_STUDENTS_COURSES_JOIN = PATH_STUDENTS_WITH_ID + COURSE;
  //Students Subjects Join
  public static final String PATH_STUDENTS_SUBJECTS_JOIN = PATH_STUDENTS_WITH_ID + SUBJECT;
  //Subjects Students Join
  public static final String PATH_SUBJECTS_STUDENTS_JOIN = PATH_SUBJECTS_WITH_ID + STUDENT;
  //Subjects Courses Join
  public static final String PATH_SUBJECTS_COURSES_JOIN = PATH_SUBJECTS_WITH_ID + COURSE;
  //Students Subjects Course Join
  public static final String PATH_STUDENTS_SUBJECTS_COURSES_JOIN = PATH_STUDENTS_WITH_ID + COURSE + ID_AUX;
  //Courses Subjects Students Join
  public static final String PATH_COURSES_SUBJECTS_STUDENTS_JOIN = PATH_COURSES_WITH_ID + STUDENT + ID_AUX;
  //Courses No Courses By Student
  public static final String PATH_NO_COURSES_BY_STUDENT = PATH_STUDENTS_WITH_ID + NO_COURSES;
  //Courses No Student By Course
  public static final String PATH_NO_STUDENT_BY_COURSE = PATH_COURSES_WITH_ID + NO_STUDENTS;
  //No Subjects By Course
  public static final String PATH_NO_SUBJECT_BY_COURSE = PATH_COURSES_WITH_ID + NO_SUBJECTS;
  //No Courses By Subject
  public static final String PATH_NO_COURSES_BY_SUBJECT = PATH_SUBJECTS_WITH_ID + NO_COURSES;

  /**
  * Private constructor for utility class.
  */
  private Paths() {

  }
}
