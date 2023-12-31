package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.NewsLetterSubscriberDTO;
import com.codebunny.NordicRose.entity.NewsLetterSubscriber;
import com.codebunny.NordicRose.exception.DuplicateSubscriberException;
import com.codebunny.NordicRose.repository.NewsLetterSubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsLetterSubscriberService {

    @Autowired
    private NewsLetterSubscriberRepository repository;

    public NewsLetterSubscriberDTO addNew(NewsLetterSubscriberDTO dto) throws DuplicateSubscriberException {
        if (repository.existsById(dto.getEmail())) {
            throw new DuplicateSubscriberException("Subscriber with email " + dto.getEmail() + " already exists.");
        }

        NewsLetterSubscriber entity = new NewsLetterSubscriber();
        entity.setEmail(dto.getEmail());
        return NewsLetterSubscriberDTO.fromEntity(repository.save(entity));
    }
}
