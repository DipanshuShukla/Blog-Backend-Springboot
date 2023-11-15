package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.BlogDTO;
import com.codebunny.NordicRose.dto.BlogPageDTO;
import com.codebunny.NordicRose.entity.Blogs;
import com.codebunny.NordicRose.entity.Tags;
import com.codebunny.NordicRose.repository.BlogsRepository;
import com.codebunny.NordicRose.repository.TagsRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BlogServiceTest {

    @Mock
    private BlogsRepository blogsRepository;

    @Mock
    private TagsRepository tagsRepository;

    @InjectMocks
    private BlogService blogService;

    @Test
    void testGetRandom() {
        // Mock the behavior of blogsRepository.findRandom() to return a specific Blogs object
        Mockito.when(blogsRepository.findRandom()).thenReturn(new Blogs(/* provide necessary values */));

        // Call the method under test
        BlogDTO result = blogService.getRandom();

        // Assert that the result is not null
        assertNotNull(result);
    }

    @Test
    void testFindById() {
        // Mock the behavior of blogsRepository.findById() to return a specific Blogs object
        Mockito.when(blogsRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(new Blogs(/* provide necessary values */)));

        // Mock the behavior of tagsRepository.findByBlogId() to return a list of Tags
        Mockito.when(tagsRepository.findByBlogId(Mockito.anyInt())).thenReturn(List.of(new Tags(1, "Tag1")));

        // Call the method under test
        BlogPageDTO result = blogService.findById(1);

        // Assert that the result is not null
        assertNotNull(result);

    }

    @Test
    void testFindPaged() {
        // Mock the behavior of blogsRepository.findPaged() to return a list of Blogs objects
        Mockito.when(blogsRepository.findPaged(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt())).thenReturn(List.of(new Blogs(/* provide necessary values */)));

        // Call the method under test
        List<BlogDTO> result = blogService.findPaged(1, 10, 1);

        // Assert that the result is not null
        assertNotNull(result);
    }
}
