package org.example.client;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

public interface ResourceServiceClient {

    @GetExchange("/simple")
    String getSimpleResponse();
}
