package com.apitest.api.Users.ResponseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
        String message , HttpStatus http , Object obj){
        HashMap<String,Object> response = new HashMap<>();
        response.put("status Code",http.value());
        response.put("message",message);
        response.put("data",obj);

        return new ResponseEntity<>(response , http);
    }

}
