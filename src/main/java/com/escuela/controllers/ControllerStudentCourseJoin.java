package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentCourseJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceJoinStudentCourse;
import com.escuela.support.Paths;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerStudentCourseJoin {

  @Autowired
  private ServiceJoinStudentCourse serviceJoinStudentCourse;

  @Autowired
  private Helper<StudentCourseJoin> helper;

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_STUDENTS_COURSES_JOIN)
  public ResponseEntity<ResponseBody> getById(final @PathVariable Integer id) {
    helper.setId(id);
    Response response = serviceJoinStudentCourse.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
