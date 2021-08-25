package com.inditex.javatest.api.api;

import com.inditex.javatest.api.model.Price;
import com.inditex.javatest.api.model.PriceFilter;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PriceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-25T13:14:26.085+02:00[Europe/Paris]")

public interface PriceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * @see PriceApi#getPriceByFilter
     */
    default ResponseEntity<Price> getPriceByFilter( PriceFilter  priceFilter) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"end-date\" : \"2000-01-23T04:56:07.000+00:00\",  \"product\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : 1  },  \"price\" : 5.962133916683182377482808078639209270477294921875,  \"start-date\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"curr\" : \"curr\",  \"brand\" : {    \"name\" : \"name\",    \"id\" : 6  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
