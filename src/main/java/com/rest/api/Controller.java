package com.rest.api;//

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class Controller {


    @CrossOrigin
    @RequestMapping(value="/**", method = RequestMethod.GET)
    @ResponseBody
    public ApiResponse search(HttpServletRequest request) throws Exception{
        ApiException apiException = new ApiException();
        ApiError error = new ApiError("CarNotFound", "No car was found for this car ID.");
        apiException.setError(error);

        return new ApiResponse(apiException, HttpStatus.NOT_FOUND);

    }

}
