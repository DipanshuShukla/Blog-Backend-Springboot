package com.codebunny.NordicRose.controller;

import com.codebunny.NordicRose.dto.TagDTO;
import com.codebunny.NordicRose.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagsController {
    @Autowired
    private TagsService service;

    @GetMapping("/tags")
    public List<TagDTO> getTags(){
        return service.getTags();
    }
}
