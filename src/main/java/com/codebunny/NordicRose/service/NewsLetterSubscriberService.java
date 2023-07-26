package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.NewsLetterSubscriberDTO;
import com.codebunny.NordicRose.entity.NewsLetterSubscriber;
import com.codebunny.NordicRose.repository.NewsLetterSubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsLetterSubscriberService {
    @Autowired
    private NewsLetterSubscriberRepository repository;

    public NewsLetterSubscriberDTO addNew(NewsLetterSubscriberDTO dto){
        if(repository.existsById(dto.getEmail())) return new NewsLetterSubscriberDTO();
        NewsLetterSubscriber entity = new NewsLetterSubscriber();
        entity.setEmail(dto.getEmail());
        return NewsLetterSubscriberDTO.fromEntity(repository.save(entity));
    }
}
