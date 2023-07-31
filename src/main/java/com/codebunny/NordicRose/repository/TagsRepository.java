package com.codebunny.NordicRose.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codebunny.NordicRose.entity.Tags;

import java.util.List;

public interface TagsRepository extends CrudRepository<Tags, Integer> {
    List<Tags> findAll();
    @Query(nativeQuery=true, value="SELECT * FROM tags where tagid in (SELECT tagid FROM blog_tags WHERE blogid=?1)")
    public List<Tags> findByBlogId(Integer id);
}
