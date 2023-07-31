package com.codebunny.NordicRose.repository;

import com.codebunny.NordicRose.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
