package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.Course;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceGet;
import com.escuela.services.ServiceNoCourseByStudent;
import com.escuela.services.ServiceNoCourseBySubject;
import com.escuela.support.Paths;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController.
 */
@RestController
public class ControllerNoCourseByStudent {

  @Autowired
  private ServiceNoCourseByStudent serviceNoCourseByStudent;

  @Autowired
  private ServiceNoCourseBySubject serviceNoCourseBySubject;

  @Autowired
  private Helper<Course> helper;

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_NO_COURSES_BY_STUDENT)
  public ResponseEntity<ResponseBody> getNoCoursesByStudent(final @PathVariable Integer id) {
    helper.setId(id);
    Response response = serviceNoCourseByStudent.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_NO_COURSES_BY_SUBJECT)
  public ResponseEntity<ResponseBody> getNoCoursesBySubject(final @PathVariable Integer id) {
    helper.setId(id);
    Response response = serviceNoCourseBySubject.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
