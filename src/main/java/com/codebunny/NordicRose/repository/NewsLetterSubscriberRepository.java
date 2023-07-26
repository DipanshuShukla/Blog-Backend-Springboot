package com.codebunny.NordicRose.repository;

import com.codebunny.NordicRose.entity.NewsLetterSubscriber;
import org.springframework.data.repository.CrudRepository;

public interface NewsLetterSubscriberRepository extends CrudRepository<NewsLetterSubscriber,String> {
}
