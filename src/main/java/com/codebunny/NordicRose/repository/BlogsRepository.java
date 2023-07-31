package com.codebunny.NordicRose.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.codebunny.NordicRose.entity.Blogs;

import java.util.List;

public interface BlogsRepository extends CrudRepository<Blogs, Integer> {
    @Query(nativeQuery=true, value="SELECT * FROM blogs ORDER BY rand() LIMIT 1")
    public Blogs findRandom();

    @Query(nativeQuery=true, value="SELECT * FROM blogs WHERE blogid<>?1 LIMIT ?2 OFFSET ?3")
    public List<Blogs> findPaged(Integer excluded_id, Integer pageSize, Integer pageNo);

}
