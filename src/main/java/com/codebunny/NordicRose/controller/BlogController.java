package com.codebunny.NordicRose.controller;

import com.codebunny.NordicRose.dto.BlogDTO;
import com.codebunny.NordicRose.dto.BlogPageDTO;
import com.codebunny.NordicRose.exception.BlogNotFoundException;
import com.codebunny.NordicRose.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService service;
    @GetMapping("/random")
    public ResponseEntity<BlogDTO> getRandom(){
        return new ResponseEntity<>(service.getRandom(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        try {
            BlogPageDTO blogPageDTO = service.findById(id);
            return new ResponseEntity<>(blogPageDTO, HttpStatus.OK);
        } catch (BlogNotFoundException e) {
            // Handle the exception and return an error response
            return new ResponseEntity<>("Blog not found for ID: " + id, HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/paged")
    List<BlogDTO> findPaged(@RequestParam(defaultValue = "-1") Integer excluded_id, @RequestParam(defaultValue = "10") Integer pageSize, @RequestParam(defaultValue = "1") Integer pageNo){
        return service.findPaged(excluded_id,pageSize,pageNo);
    }
}
