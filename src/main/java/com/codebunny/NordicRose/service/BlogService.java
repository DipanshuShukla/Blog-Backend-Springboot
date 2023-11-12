package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.BlogDTO;
import com.codebunny.NordicRose.dto.BlogPageDTO;
import com.codebunny.NordicRose.dto.TagDTO;
import com.codebunny.NordicRose.entity.Blogs;
import com.codebunny.NordicRose.exception.BlogNotFoundException;
import com.codebunny.NordicRose.repository.BlogTagsRepository;
import com.codebunny.NordicRose.repository.BlogsRepository;
import com.codebunny.NordicRose.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogsRepository blogsRepository;
    @Autowired
    private TagsRepository tagsRepository;

    public BlogDTO getRandom() {
        return BlogDTO.fromEntity(blogsRepository.findRandom());
    }

    public BlogPageDTO findById(Integer id) throws BlogNotFoundException {
        return new BlogPageDTO(BlogDTO.fromEntity(blogsRepository.findById(id), id), tagsRepository.findByBlogId(id).stream().map(TagDTO::fromEntity).toList());
    }

    public List<BlogDTO> findPaged(Integer excluded_id, Integer pageSize, Integer pageNo){
        return blogsRepository.findPaged(excluded_id,pageSize,(pageNo - 1) * pageSize).stream().map(BlogDTO::fromEntity).toList();
    }
}
