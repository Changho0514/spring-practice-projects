package org.example.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardController implements Controller{
    private final String forwardUrlPath;

    public ForwardController(String forwardUrlPath) {
        this.forwardUrlPath = forwardUrlPath;
    }

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return forwardUrlPath;
    }
}
