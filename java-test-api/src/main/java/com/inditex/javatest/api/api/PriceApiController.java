package com.inditex.javatest.api.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-25T13:14:26.085+02:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.javaTest.base-path:/}")
public class PriceApiController implements PriceApi {

    private final PriceApiDelegate delegate;

    public PriceApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PriceApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PriceApiDelegate() {});
    }

    @Override
    public PriceApiDelegate getDelegate() {
        return delegate;
    }

}
