package com.codebunny.NordicRose.service;

import com.codebunny.NordicRose.dto.TagDTO;
import com.codebunny.NordicRose.entity.Tags;
import com.codebunny.NordicRose.repository.TagsRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TagsServiceTest {

    @Mock
    private TagsRepository tagsRepository;

    @InjectMocks
    private TagsService tagsService = new TagsService();

    @Test
    void testGetTags() {
        // Arrange
        Tags tag1 = new Tags(1, "Tag1");
        Tags tag2 = new Tags(2, "Tag2");
        Mockito.when(tagsRepository.findAll()).thenReturn(List.of(tag1, tag2));

        // Act
        List<TagDTO> result = tagsService.getTags();

        // Assert
        assertEquals(2, result.size());
        assertEquals(tag1.getTagid(), result.get(0).getTagid());
        assertEquals(tag1.getTagname(), result.get(0).getTagname());
        assertEquals(tag2.getTagid(), result.get(1).getTagid());
        assertEquals(tag2.getTagname(), result.get(1).getTagname());
    }

    @Test
    void testGetTagsEmptyList() {
        // Arrange
        Mockito.when(tagsRepository.findAll()).thenReturn(List.of());

        // Act
        List<TagDTO> result = tagsService.getTags();

        // Assert
        assertEquals(0, result.size());
    }

}
