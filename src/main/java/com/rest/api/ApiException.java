package com.rest.api;//

import lombok.Getter;
import lombok.Setter;

// ----------------------------------------------------------------------------
// file:    Error
// package: com.rest.api
// project: api
// author:  Yamen Jeries
// email:    y.jeries@reply.de
// created: 2019-11-12 / 21:26
//
// Copyright (c) 2005-2019 Arlanis Reply AG
// ALL RIGHTS RESERVED
// ----------------------------------------------------------------------------
//
@Getter
@Setter
public class ApiException {
    ApiError error;
}


