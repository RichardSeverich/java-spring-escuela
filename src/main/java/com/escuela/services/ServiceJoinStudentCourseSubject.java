package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.StudentCourseSubjectJoin;
import com.escuela.repository.RepositoryStudentsCoursesSubjectsJoin;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Service.
*/
@Service
public class ServiceJoinStudentCourseSubject implements IService {

  @Autowired
  private Helper<StudentCourseSubjectJoin> helper;

  @Autowired
  private ResponseBuilder<StudentCourseSubjectJoin> responseBuilder;

  @Autowired
  private RepositoryStudentsCoursesSubjectsJoin repository;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response<StudentCourseSubjectJoin> getResponse() {
    Iterable<StudentCourseSubjectJoin> iterable =
        repository.findStudentCourseSubjectJoin(helper.getId());
    iterable.forEach(helper.getList()::add);
    return responseBuilder.getResponseOkForGet();
  }
}
