package com.example.springbootweb;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class responseController {

    @RequestMapping("/response")
    public void response(HttpServletResponse  response) throws IOException {

        response.setStatus(222);
        response.setHeader("name", "sph");
        response.getWriter().write("<h1>Hello World</h1>");

    }

    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        return ResponseEntity.status(200).header("name", "sph").body("<h1>Hello World2</h1>");
    }
}
