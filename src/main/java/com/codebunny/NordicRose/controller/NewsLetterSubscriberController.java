package com.codebunny.NordicRose.controller;

import com.codebunny.NordicRose.dto.NewsLetterSubscriberDTO;
import com.codebunny.NordicRose.service.NewsLetterSubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsLetterSubscriberController {
    @Autowired
    private NewsLetterSubscriberService service;

    @PostMapping("/newsletter")
    private ResponseEntity<NewsLetterSubscriberDTO> addEmail(@RequestBody NewsLetterSubscriberDTO email){
        return new ResponseEntity<>(service.addNew(email), HttpStatus.OK);
    }
}
