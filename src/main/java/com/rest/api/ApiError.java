package com.rest.api;//

import lombok.Getter;
import lombok.Setter;

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
