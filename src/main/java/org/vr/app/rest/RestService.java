package org.vr.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
