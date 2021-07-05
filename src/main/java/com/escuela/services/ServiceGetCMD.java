package com.escuela.services;

import com.escuela.helpers.Helper;
import com.escuela.repository.RepositoryFactory;
import com.escuela.responses.Response;
import com.escuela.responses.ResponseBuilder;
import com.escuela.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.lang.Process;
import java.lang.Runtime;
import java.lang.Throwable;

/**
* Service.
*/
@Service
public class ServiceGetCMD<T> implements IService {

  @Autowired
  private ResponseBuilder<T> responseBuilder;

  /**
  * {@inheritDoc}
  */
  @Override
  public Response getResponse() {
      try{
        Runtime runTime = Runtime.getRuntime();
        Process process = runTime.
        exec("cmd /c jacobitus_fido.bat", null, new File("C:\\Program Files (x86)\\Jacobitus_Fido\\jacobitus-fido"));
      } catch (Throwable throwable){
        throwable.printStackTrace();
        return responseBuilder.getResponseConflict();
      }
    return responseBuilder.getResponseOkForGet();
  }
}
