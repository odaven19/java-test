/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.inditex.javatest.api.api;

import com.inditex.javatest.api.model.Price;
import com.inditex.javatest.api.model.PriceFilter;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-25T13:14:26.085+02:00[Europe/Paris]")

@Validated
@Api(value = "price", description = "the price API")
public interface PriceApi {

    default PriceApiDelegate getDelegate() {
        return new PriceApiDelegate() {};
    }

    @ApiOperation(value = "Get a list of User with their descriptions.", nickname = "getPriceByFilter", notes = "", response = Price.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Price.class) })
    @RequestMapping(value = "/price",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Price> getPriceByFilter(@ApiParam(value = ""  )  @Valid @RequestBody PriceFilter priceFilter) {
        return getDelegate().getPriceByFilter(priceFilter);
    }

}
