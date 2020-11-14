package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.Subjet;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBody;
import com.escuela.services.ServiceDelete;
import com.escuela.services.ServiceGet;
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
public class ControllerSubjet {

  private static final String ENTITY_NAME = "subjet";

  @Autowired
  private ServiceGet<Subjet> serviceGet;

  @Autowired
  private ServiceGetById<Subjet> serviceGetById;

  @Autowired
  private ServicePost<Subjet> servicePost;

  @Autowired
  private ServicePut<Subjet> servicePut;

  @Autowired
  private ServiceDelete<Subjet> serviceDelete;

  @Autowired
  private Helper<Subjet> helper;

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_SUBJETS)
  public ResponseEntity<ResponseBody> getAll() {
    helper.setEntityName(ENTITY_NAME);
    Response response = serviceGet.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_SUBJETS_WITH_ID)
  public ResponseEntity<ResponseBody> getById(final @PathVariable Integer id) {
    helper.setEntityName(ENTITY_NAME);
    helper.setId(id);
    Response response = serviceGetById.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param course course.
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.POST, value = Paths.PATH_SUBJETS)
  public ResponseEntity<ResponseBody> add(final @RequestBody @Valid Subjet subjet) {
    helper.setEntityName(ENTITY_NAME);
    helper.setEntity(subjet);
    Response response = servicePost.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param course course.
  * @param id   id.
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.PUT, value = Paths.PATH_SUBJETS_WITH_ID)
  public ResponseEntity<ResponseBody> update(
      final @RequestBody @Valid Subjet subjet, final @PathVariable Integer id) {
    helper.setEntityName(ENTITY_NAME);
    helper.setId(id);
    helper.setEntity(subjet);
    subjet.setId(id);
    Response response = servicePut.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param id id.
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.DELETE, value = Paths.PATH_SUBJETS_WITH_ID)
  public ResponseEntity<ResponseBody> delete(final @PathVariable Integer id) {
    helper.setEntityName(ENTITY_NAME);
    helper.setId(id);
    Response response = serviceDelete.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
