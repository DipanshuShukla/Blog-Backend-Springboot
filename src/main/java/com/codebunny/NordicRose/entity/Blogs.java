package com.codebunny.NordicRose.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "blogs")
public class Blogs {
    @Id
    private Integer blogid;
    @ManyToOne
    @JoinColumn(name = "authorid")
    private Author author;
    private String title;
    private String subtitle;
    private String thumbnail;
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getBlogId() {
        return blogid;
    }

    public void setBlogId(Integer blogId) {
        this.blogid = blogId;
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
}
