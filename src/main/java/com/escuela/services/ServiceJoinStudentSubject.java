package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentSubjectJoin;
import com.escuela.repository.RepositoryStudentsSubjectsJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceJoinStudentSubject implements IService {

  @Autowired
  private Helper<StudentSubjectJoin> helper;

  @Autowired
  private ResponseBuilder<StudentSubjectJoin> responseBuilder;

  @Autowired
  private RepositoryStudentsSubjectsJoin repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<StudentSubjectJoin> iterable = repository.findStudentSubjectJoin(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}