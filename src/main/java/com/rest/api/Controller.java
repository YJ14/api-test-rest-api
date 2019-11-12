package com.rest.api;//

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

// ----------------------------------------------------------------------------
// file:    Controller
// package: com.rest.api
// project: api
// author:  Yamen Jeries
// email:    y.jeries@reply.de
// created: 2019-11-12 / 21:20
//
// Copyright (c) 2005-2019 Arlanis Reply AG
// ALL RIGHTS RESERVED
// ----------------------------------------------------------------------------
//
@RestController
@RequestMapping
public class Controller {


    @CrossOrigin
    @RequestMapping(value="restapi/test", method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse search(HttpServletRequest request) throws Exception{
        ApiException apiException = new ApiException();
        ApiError error = new ApiError("CarNotFound", "No car was found for this car ID.");
        apiException.setError(error);

        return new ApiResponse(apiException, HttpStatus.NOT_FOUND);

    }

}
