package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.Subject;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceNoSubjectByCourse;
import com.escuela.support.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController.
 */
@RestController
public class ControllerNoSubjectsByCourse {

  @Autowired
  private ServiceNoSubjectByCourse serviceNoSubjectByCourse;

  @Autowired
  private Helper<Subject> helper;

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_NO_SUBJECT_BY_COURSE)
  public ResponseEntity<ResponseBody> getNoSubjectsByCourse(final @PathVariable Integer id) {
    helper.setId(id);
    Response response = serviceNoSubjectByCourse.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
