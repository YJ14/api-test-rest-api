package com.rest.api;//

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
@Slf4j
public class Controller {


    @Value("${refreshCaching}")
    private int timeout;

    @CrossOrigin
    @RequestMapping(value="/**", method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse search(HttpServletRequest request) throws Exception{
        ApiException apiException = new ApiException();

        ApiError error = new ApiError("Service Unavailable", "Service is down!");
        apiException.setError(error);
        log.info("......... Sleeeeeeeeeeeeeping for " + timeout);
        Thread.sleep(timeout);
        log.info("......... Awake!");
        return new ApiResponse(apiException, HttpStatus.SERVICE_UNAVAILABLE);

    }

}
