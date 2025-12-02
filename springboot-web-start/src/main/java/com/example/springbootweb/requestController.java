package com.example.springbootweb;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class requestController {

    @RequestMapping("/request")
    public String request(HttpServletRequest  request) {
        System.out.println(request.getMethod());
        System.out.println(request.getRequestURI());
        System.out.println(request.getQueryString());
        System.out.println(request.getRequestURL());

        request.getUserPrincipal();

        return "success";
    }
}
