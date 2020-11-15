package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.CourseStudentJoin;
import com.escuela.repository.RepositoryCoursesStudentsJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
* Service.
*/
@Service
public class ServiceJoinCourseStudent implements IService {

  @Autowired
  private Helper<CourseStudentJoin> helper;

  @Autowired
  private ResponseBuilder<CourseStudentJoin> responseBuilder;

  @Autowired
  private RepositoryCoursesStudentsJoin repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<CourseStudentJoin> iterable = repository.findCourseStudentJoin(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}