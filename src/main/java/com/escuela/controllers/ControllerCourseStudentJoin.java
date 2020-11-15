package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.CourseStudentJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceJoinCourseStudent;
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
public class ControllerCourseStudentJoin {

  @Autowired
  private ServiceJoinCourseStudent serviceJoinCourseStudent;

  @Autowired
  private Helper<CourseStudentJoin> helper;

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_COURSES_STUDENTS_JOIN)
  public ResponseEntity<ResponseBody> getById(final @PathVariable Integer id) {
    helper.setId(id);
    Response response = serviceJoinCourseStudent.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
