package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.Student;
import com.escuela.repository.RepositoryStudents;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceNoStudentByCourse implements IService {

  @Autowired
  private Helper<Student> helper;

  @Autowired
  private ResponseBuilder<Student> responseBuilder;

  @Autowired
  private RepositoryStudents repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<Student> iterable = repository.findNoStudentsByCourse(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}