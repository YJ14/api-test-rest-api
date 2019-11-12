package com.rest.api;//

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ApiResponse extends ResponseEntity {

    public ApiResponse(HttpStatus status) {
        super(status);
    }

    public ApiResponse(Object body, HttpStatus status) {
        super(body, status);
    }

    public ApiResponse(MultiValueMap headers, HttpStatus status) {
        super(headers, status);
    }

    public ApiResponse(Object body, MultiValueMap headers, HttpStatus status) {
        super(body, headers, status);
    }
}
