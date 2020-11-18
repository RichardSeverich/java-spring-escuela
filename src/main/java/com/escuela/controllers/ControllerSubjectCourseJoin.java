package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.CourseSubjectJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceJoinSubjectCourse;
import com.escuela.support.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSubjectCourseJoin {

  @Autowired
  private ServiceJoinSubjectCourse serviceJoinSubjectCourse;

  @Autowired
  private Helper<CourseSubjectJoin> helper;

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_SUBJECTS_COURSES_JOIN)
  public ResponseEntity<ResponseBody> getById(final @PathVariable Integer id) {
    helper.setId(id);
    Response response = serviceJoinSubjectCourse.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
