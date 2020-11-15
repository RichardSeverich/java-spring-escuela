package com.escuela.controllers;

import com.escuela.helpers.Helper;
import com.escuela.models.SubjectStudent;
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
public class ControllerSubjectStudent {

  private static final String ENTITY_NAME = "subject_student";

  @Autowired
  private ServiceGet<SubjectStudent> serviceGet;

  @Autowired
  private ServiceGetById<SubjectStudent> serviceGetById;

  @Autowired
  private ServicePost<SubjectStudent> servicePost;

  @Autowired
  private ServicePut<SubjectStudent> servicePut;

  @Autowired
  private ServiceDelete<SubjectStudent> serviceDelete;

  @Autowired
  private Helper<SubjectStudent> helper;

  /**
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_SUBJECTS_STUDENTS)
  public ResponseEntity<ResponseBody> getAll() {
    helper.setEntityName(ENTITY_NAME);
    Response response = serviceGet.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param id id.
  * @return Response entity..
  */
  @RequestMapping(method = RequestMethod.GET, value = Paths.PATH_SUBJECTS_STUDENTS_WITH_ID)
  public ResponseEntity<ResponseBody> getById(final @PathVariable Integer id) {
    helper.setEntityName(ENTITY_NAME);
    helper.setId(id);
    Response response = serviceGetById.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param SubjectStudent subjectStudent.
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.POST, value = Paths.PATH_SUBJECTS_STUDENTS)
  public ResponseEntity<ResponseBody> add(final @RequestBody @Valid SubjectStudent subjectStudent) {
    helper.setEntityName(ENTITY_NAME);
    helper.setEntity(subjectStudent);
    Response response = servicePost.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param SubjectStudent subjectStudent.
  * @param id   id.
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.PUT, value = Paths.PATH_SUBJECTS_STUDENTS_WITH_ID)
  public ResponseEntity<ResponseBody> update(
      final @RequestBody @Valid SubjectStudent subjectStudent, final @PathVariable Integer id) {
    helper.setEntityName(ENTITY_NAME);
    helper.setId(id);
    helper.setEntity(subjectStudent);
    subjectStudent.setId(id);
    Response response = servicePut.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }

  /**
  * @param id id.
  * @return Response entity.
  */
  @RequestMapping(method = RequestMethod.DELETE, value = Paths.PATH_SUBJECTS_STUDENTS_WITH_ID)
  public ResponseEntity<ResponseBody> delete(final @PathVariable Integer id) {
    helper.setEntityName(ENTITY_NAME);
    helper.setId(id);
    Response response = serviceDelete.getResponse();
    return ResponseEntity.status(response.getHttpStatus()).body(response.getBody());
  }
}
