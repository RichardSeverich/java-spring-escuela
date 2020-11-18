package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentCourseJoin;
import com.escuela.repository.RepositoryStudentsCoursesJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceJoinStudentCourse implements IService {

  @Autowired
  private Helper<StudentCourseJoin> helper;

  @Autowired
  private ResponseBuilder<StudentCourseJoin> responseBuilder;

  @Autowired
  private RepositoryStudentsCoursesJoin repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<StudentCourseJoin> iterable = repository.findStudentCourseJoin(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}