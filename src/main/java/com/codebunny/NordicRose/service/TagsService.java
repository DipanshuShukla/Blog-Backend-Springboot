package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.TagDTO;
import com.codebunny.NordicRose.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class TagsService {
    @Autowired
    private TagsRepository repo;

    public List<TagDTO> getTags(){
        return repo.findAll().stream().map(TagDTO::fromEntity).toList();
    }
}
