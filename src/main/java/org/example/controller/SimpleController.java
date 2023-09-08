package org.example.controller;


import org.example.client.ResourceServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private ResourceServiceClient resourceServiceClient;

    public SimpleController(ResourceServiceClient resourceServiceClient) {
        this.resourceServiceClient = resourceServiceClient;
    }

    @GetMapping("/simple-response")
    public String simpleResourceServerResponse() {
        return "<h1>" + resourceServiceClient.getSimpleResponse() + "</h1>";
    }
}
