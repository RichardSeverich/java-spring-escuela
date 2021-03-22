package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentSubjectJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceJoinCourseStudentSubject;
import com.escuela.support.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCourseStudentSubjectJoin {

  @Autowired
  private ServiceJoinCourseStudentSubject serviceJoinCourseStudentSubject;

  @Autowired
  private Helper<StudentSubjectJoin> helper;

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_COURSES_STUDENTS_SUBJECTS_JOIN)
  public ResponseEntity<ResponseBody>
      getByIdCourseStudentSubject(final @PathVariable Integer id) {
    helper.setId(id); //Id Course
    Response response = serviceJoinCourseStudentSubject.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
