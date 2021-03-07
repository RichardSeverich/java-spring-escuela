package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentSubjectJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceJoinStudentSubjectCourse;
import com.escuela.support.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStudentSubjectCourseJoin {

  @Autowired
  private ServiceJoinStudentSubjectCourse serviceJoinStudentSubjectCourse;

  @Autowired
  private Helper<StudentSubjectJoin> helper;

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_STUDENTS_SUBJECTS_COURSES_JOIN)
  public ResponseEntity<ResponseBody> getByIdStudentsCourses(final @PathVariable Integer id, final @PathVariable Integer aux) {
    helper.setId(id); //Id Student
    helper.setIdAux(aux); //Id Course
    Response response = serviceJoinStudentSubjectCourse.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_COURSES_SUBJECTS_STUDENTS_JOIN)
  public ResponseEntity<ResponseBody> getByIdCoursesSubjectsStudents(final @PathVariable Integer id, final @PathVariable Integer aux) {
    helper.setId(aux); //Id Student
    helper.setIdAux(id); //Id Course
    Response response = serviceJoinStudentSubjectCourse.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
