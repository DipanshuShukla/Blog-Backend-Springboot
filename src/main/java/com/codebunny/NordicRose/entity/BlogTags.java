package com.codebunny.NordicRose.entity;

import com.codebunny.NordicRose.utils.BlogTagsId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog_tags")
@IdClass(BlogTagsId.class)
public class BlogTags {
    @Id
    private Integer blogid;
    @Id
    private Integer tagid;

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public Integer getTagId() {
        return tagid;
    }

    public void setTagId(Integer tagId) {
        this.tagid = tagId;
    }
}
