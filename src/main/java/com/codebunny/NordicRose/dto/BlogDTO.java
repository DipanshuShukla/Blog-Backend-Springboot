package com.codebunny.NordicRose.dto;

import com.codebunny.NordicRose.entity.Author;
import com.codebunny.NordicRose.entity.Blogs;
import com.codebunny.NordicRose.exception.BlogNotFoundException;

import java.util.Optional;

public class BlogDTO {
    private Integer blogid;
    private AuthorDTO author;
    private String title;
    private String subtitle;
    private String thumbnail;

    public BlogDTO() {
    }

    public BlogDTO(Integer blogid, AuthorDTO author, String title, String subtitle, String thumbnail) {
        this.blogid = blogid;
        this.author = author;
        this.title = title;
        this.subtitle = subtitle;
        this.thumbnail = thumbnail;
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

    public static BlogDTO fromEntity(Blogs entity){
        return new BlogDTO(entity.getBlogId(), AuthorDTO.fromEntity(entity.getAuthor()), entity.getTitle(), entity.getSubtitle(), entity.getThumbnail());
    }

    public static BlogDTO fromEntity(Optional<Blogs> optional, int blogId) throws BlogNotFoundException{
        Blogs entity = optional.orElseThrow(() -> new BlogNotFoundException("The requested blog with ID " + blogId + " does not exist."));
        return fromEntity(entity);
    }

}
