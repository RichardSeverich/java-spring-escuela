package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.CourseSubjectJoin;
import com.escuela.repository.RepositorySubjectsCoursesJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceJoinSubjectCourse implements IService {

  @Autowired
  private Helper<CourseSubjectJoin> helper;

  @Autowired
  private ResponseBuilder<CourseSubjectJoin> responseBuilder;

  @Autowired
  private RepositorySubjectsCoursesJoin repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    Iterable<CourseSubjectJoin> iterable = repository.findSubjectCourseJoin(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}