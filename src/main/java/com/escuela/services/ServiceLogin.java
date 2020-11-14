package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.models.User;
import com.escuela.models.UserAuth;
import com.escuela.repository.RepositoryUsers;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.security.JWTToken;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
* Service.
*/
@Service
public class ServiceLogin implements IService {

  @Autowired
  private Helper<UserAuth> helper;

  @Autowired
  private ResponseBuilder<UserAuth> responseBuilder;

  @Autowired
  private RepositoryUsers repositoryUsers;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
    String username = helper.getEntity().getUsername();
    String password = helper.getEntity().getPassword();
    Iterable<User> iterable = repositoryUsers.findUsers(username, password);
    boolean isEmpty = iterable.iterator().hasNext();
    // Negative scenario
    if (!isEmpty) {
      return responseBuilder.getResponseNotFound();
    }
    // Positive scenario
    helper.getEntity().setToken(JWTToken.getJWTToken(username));
    helper.getList().add(helper.getEntity());
    return responseBuilder.getResponseOkForGet();
  }
}
