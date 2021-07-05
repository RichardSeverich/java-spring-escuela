package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.User;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceDelete;
import com.escuela.services.ServiceGetCMD;
import com.escuela.services.ServiceGetById;
import com.escuela.services.ServicePost;
import com.escuela.services.ServicePut;
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
public class ControllerCMD {

  private static final String ENTITY_NAME = "CMD";

  @Autowired
  private ServiceGetCMD<User> serviceGetCMD;

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_CMD)
  public ResponseEntity<ResponseBody> getAll() {
    Response response = serviceGetCMD.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
