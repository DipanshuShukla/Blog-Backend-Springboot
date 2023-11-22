package com.codebunny.NordicRose.controller;

import com.codebunny.NordicRose.dto.NewsLetterSubscriberDTO;
import com.codebunny.NordicRose.exception.DuplicateSubscriberException;
import com.codebunny.NordicRose.service.NewsLetterSubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsLetterSubscriberController {
    @Autowired
    private NewsLetterSubscriberService service;

    @CrossOrigin
    @PostMapping("/newsletter")
    private ResponseEntity<?> addEmail(@RequestBody NewsLetterSubscriberDTO email){
        try {
            NewsLetterSubscriberDTO result = service.addNew(email);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (DuplicateSubscriberException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("An unexpected error occurred.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
