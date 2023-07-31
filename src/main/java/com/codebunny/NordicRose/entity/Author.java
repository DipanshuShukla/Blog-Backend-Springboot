package com.codebunny.NordicRose.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
    @Id
    private Integer id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String about;
    private String linkfb;
    private String linktwt;
    private String linkwa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLinkfb() {
        return linkfb;
    }

    public void setLinkfb(String linkfb) {
        this.linkfb = linkfb;
    }

    public String getLinktwt() {
        return linktwt;
    }

    public void setLinktwt(String linktwt) {
        this.linktwt = linktwt;
    }

    public String getLinkwa() {
        return linkwa;
    }

    public void setLinkwa(String linkwa) {
        this.linkwa = linkwa;
    }
}
