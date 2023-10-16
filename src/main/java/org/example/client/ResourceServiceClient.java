package org.example.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("http://localhost:8484")
public interface ResourceServiceClient {


    @GetExchange("/simple")
    String getSimpleResponse();
}
