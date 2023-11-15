package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.NewsLetterSubscriberDTO;
import com.codebunny.NordicRose.entity.NewsLetterSubscriber;
import com.codebunny.NordicRose.exception.DuplicateSubscriberException;
import com.codebunny.NordicRose.repository.NewsLetterSubscriberRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NewsLetterSubscriberServiceTest {

    @Mock
    private NewsLetterSubscriberRepository repository;

    @InjectMocks
    private NewsLetterSubscriberService newsLetterSubscriberService = new NewsLetterSubscriberService();

    @Test
    void testAddNewSubscriber() {
        // Arrange
        NewsLetterSubscriberDTO subscriberDTO = new NewsLetterSubscriberDTO("test@example.com");
        NewsLetterSubscriber subscriberEntity = new NewsLetterSubscriber();
        subscriberEntity.setEmail(subscriberDTO.getEmail());
        Mockito.when(repository.existsById(subscriberDTO.getEmail())).thenReturn(false);
        Mockito.when(repository.save(Mockito.any(NewsLetterSubscriber.class))).thenReturn(subscriberEntity);

        // Act
        NewsLetterSubscriberDTO result = newsLetterSubscriberService.addNew(subscriberDTO);

        // Assert
        assertEquals(subscriberDTO.getEmail(), result.getEmail());
    }

    @Test
    void testAddExistingSubscriber() {
        // Arrange
        NewsLetterSubscriberDTO existingSubscriberDTO = new NewsLetterSubscriberDTO("existing@example.com");
        Mockito.when(repository.existsById(existingSubscriberDTO.getEmail())).thenReturn(true);

        // Act and Assert
        DuplicateSubscriberException exception = assertThrows(DuplicateSubscriberException.class, () -> {
            newsLetterSubscriberService.addNew(existingSubscriberDTO);
        });

        assertEquals("Subscriber with email existing@example.com already exists.", exception.getMessage());
    }

    @Test
    void testAddNewSubscriberRepositorySaveCalled() {
        // Arrange
        NewsLetterSubscriberDTO subscriberDTO = new NewsLetterSubscriberDTO("newsubscriber@example.com");
        NewsLetterSubscriber subscriberEntity = new NewsLetterSubscriber();
        subscriberEntity.setEmail(subscriberDTO.getEmail());
        Mockito.when(repository.existsById(subscriberDTO.getEmail())).thenReturn(false);
        Mockito.when(repository.save(Mockito.any(NewsLetterSubscriber.class))).thenReturn(subscriberEntity);

        // Act
        newsLetterSubscriberService.addNew(subscriberDTO);

        // Assert
        Mockito.verify(repository, Mockito.times(1)).save(Mockito.any(NewsLetterSubscriber.class));
    }

    // Add more test cases as needed
}


