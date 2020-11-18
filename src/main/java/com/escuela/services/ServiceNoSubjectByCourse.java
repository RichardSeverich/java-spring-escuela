package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.Subject;
import com.escuela.repository.RepositorySubjects;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceNoSubjectByCourse implements IService {

  @Autowired
  private Helper<Subject> helper;

  @Autowired
  private ResponseBuilder<Subject> responseBuilder;

  @Autowired
  private RepositorySubjects repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<Subject> iterable = repository.findNoSubjectsByCourses(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}