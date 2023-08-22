package com.codebunny.NordicRose.dto;

import com.codebunny.NordicRose.entity.Author;

public class AuthorDTO {
    private Integer id;
    private String name;
    private String about;

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

    public static AuthorDTO fromEntity(Author author){
        if (author==null) return new AuthorDTO();
        AuthorDTO dto = new AuthorDTO();

        dto.setAbout(author.getAbout());
        dto.setId(author.getId());
        dto.setName(author.getName());

        return dto;
    }
}