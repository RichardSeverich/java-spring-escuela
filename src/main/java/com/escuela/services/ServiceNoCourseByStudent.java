package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.Course;
import com.escuela.repository.RepositoryCourses;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceNoCourseByStudent implements IService {

  @Autowired
  private Helper<Course> helper;

  @Autowired
  private ResponseBuilder<Course> responseBuilder;

  @Autowired
  private RepositoryCourses repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<Course> iterable = repository.findNoCoursesByStudent(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}