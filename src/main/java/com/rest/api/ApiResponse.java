package com.rest.api;//

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

// ----------------------------------------------------------------------------
// file:    ApiResponse
// package: com.rest.api
// project: api
// author:  Yamen Jeries
// email:    y.jeries@reply.de
// created: 2019-11-12 / 21:31
//
// Copyright (c) 2005-2019 Arlanis Reply AG
// ALL RIGHTS RESERVED
// ----------------------------------------------------------------------------
//
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
