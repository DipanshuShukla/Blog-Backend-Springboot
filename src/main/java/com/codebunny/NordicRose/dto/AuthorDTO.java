package com.codebunny.NordicRose.dto;

import com.codebunny.NordicRose.entity.Author;

public class AuthorDTO {
    private Integer id;
    private String name;
    private String about;
    private String linkFb;
    private String linkTwt;
    private String linkWa;

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

    public static AuthorDTO fromEntity(Author author){
        if (author==null) return new AuthorDTO();
        AuthorDTO dto = new AuthorDTO();

        dto.setAbout(author.getAbout());
        dto.setId(author.getId());
        dto.setName(author.getName());
        dto.setLinkFb(author.getLinkfb());
        dto.setLinkTwt(author.getLinktwt());
        dto.setLinkWa(author.getLinkwa());

        return dto;
    }
}