package com.rest.api;//

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class Controller {


    @Value("${refreshCaching}")
    private int timeout;

    @CrossOrigin
    @RequestMapping(value="/**", method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse search(HttpServletRequest request) throws Exception{
        ApiException apiException = new ApiException();

        ApiError error = new ApiError("CarNotFound", "No car was found for this car ID.");
        apiException.setError(error);

        Thread.sleep(timeout);

        return new ApiResponse(apiException, HttpStatus.NOT_FOUND);

    }

}
