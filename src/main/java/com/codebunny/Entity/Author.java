package com.codebunny.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
    @Id
    private Integer id;
    private String name;
    private String about;
    private String linkFb;
    private String linkTwt;
    private String linkWa;
    private String image;

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

    public String getLinkFb() {
        return linkFb;
    }

    public void setLinkFb(String linkFb) {
        this.linkFb = linkFb;
    }

    public String getLinkTwt() {
        return linkTwt;
    }

    public void setLinkTwt(String linkTwt) {
        this.linkTwt = linkTwt;
    }

    public String getLinkWa() {
        return linkWa;
    }

    public void setLinkWa(String linkWa) {
        this.linkWa = linkWa;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
