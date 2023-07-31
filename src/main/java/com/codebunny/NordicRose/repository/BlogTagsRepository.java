package com.codebunny.NordicRose.repository;

import com.codebunny.NordicRose.entity.BlogTags;
import com.codebunny.NordicRose.entity.Tags;
import com.codebunny.NordicRose.utils.BlogTagsId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogTagsRepository extends CrudRepository<BlogTags, BlogTagsId> {
}
