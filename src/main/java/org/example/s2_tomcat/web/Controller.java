package org.example.s2_tomcat.web;

import org.example.s2_tomcat.http.request.HttpRequest;
import org.example.s2_tomcat.http.response.HttpResponse;

public interface Controller {
    void handle(HttpRequest request, HttpResponse response);
}
