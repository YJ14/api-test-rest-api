package com.rest.api;//

import lombok.Getter;
import lombok.Setter;

// ----------------------------------------------------------------------------
// file:    ApiError
// package: com.rest.api
// project: api
// author:  Yamen Jeries
// email:    y.jeries@reply.de
// created: 2019-11-12 / 21:27
//
// Copyright (c) 2005-2019 Arlanis Reply AG
// ALL RIGHTS RESERVED
// ----------------------------------------------------------------------------
//
@Getter
@Setter
public class ApiError {

    String code;
    String message;

    public ApiError(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
