package io.swagger.api.factories;

import io.swagger.api.PetApiService;
import io.swagger.api.impl.PetApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-01-07T14:02:19.460Z[GMT]")public class PetApiServiceFactory {
    private final static PetApiService service = new PetApiServiceImpl();

    public static PetApiService getPetApi() {
        return service;
    }
}
