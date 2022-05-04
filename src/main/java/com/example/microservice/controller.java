package com.example.microservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class controller {

    @GetMapping(path = "/echoservice",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> echoservice(){
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "Hello", "World"));
    }

}
