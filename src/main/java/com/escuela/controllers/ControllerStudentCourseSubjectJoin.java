package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentCourseSubjectJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceJoinStudentCourseSubject;
import com.escuela.support.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStudentCourseSubjectJoin {

  @Autowired
  private ServiceJoinStudentCourseSubject serviceJoinStudentCourseSubject;

  @Autowired
  private Helper<StudentCourseSubjectJoin> helper;

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_STUDENTS_COURSES_SUBJECTS_JOIN)
  public ResponseEntity<ResponseBody<StudentCourseSubjectJoin>>
      getByIdStudentCourseSubject(final @PathVariable Integer id) {
    helper.setId(id); //Id Student
    Response<StudentCourseSubjectJoin> response = serviceJoinStudentCourseSubject.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
