package com.codebunny.NordicRose.dto;

import java.util.List;

public class BlogPageDTO {
    private Integer blogid;
    private AuthorDTO author;
    private String title;
    private String subtitle;
    private String thumbnail;
    private List<TagDTO> tags;

    public BlogPageDTO(BlogDTO dto, List<TagDTO> tags) {
        this.blogid = dto.getBlogid();
        this.author = dto.getAuthor();
        this.title = dto.getTitle();
        this.subtitle = dto.getSubtitle();
        this.thumbnail = dto.getThumbnail();
        this.tags = tags;
    }

    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }
}
