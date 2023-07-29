package com.codebunny.NordicRose.repository;

import org.springframework.data.repository.CrudRepository;

import com.codebunny.NordicRose.entity.Tags;

import java.util.List;

public interface TagsRepository extends CrudRepository<Tags, Integer> {
    List<Tags> findAll();
}
