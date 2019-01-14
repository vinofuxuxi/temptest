package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-01-14T10:16:25.619Z[GMT]")public interface PetApiService {
      Response addPet(Pet body,SecurityContext securityContext) throws NotFoundException;
      Response deletePet(Long petId,String apiKey,SecurityContext securityContext) throws NotFoundException;
      Response findPetsByStatus(List<String> status,SecurityContext securityContext) throws NotFoundException;
      Response findPetsByTags(List<String> tags,SecurityContext securityContext) throws NotFoundException;
      Response getPetById(Long petId,SecurityContext securityContext) throws NotFoundException;
      Response updatePet(Pet body,SecurityContext securityContext) throws NotFoundException;
      Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext) throws NotFoundException;
      Response uploadFile(Long petId,Object body,SecurityContext securityContext) throws NotFoundException;
}
