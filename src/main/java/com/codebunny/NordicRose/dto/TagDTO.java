package com.codebunny.NordicRose.dto;

import com.codebunny.NordicRose.entity.Tags;

public class TagDTO {
    private Integer tagid;
    private String tagname;

    // Default constructor
    public TagDTO() {
    }

    public TagDTO(Integer tagid, String tagname) {
        this.tagid = tagid;
        this.tagname = tagname;
    }

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public static TagDTO fromEntity(Tags entity){
        return new TagDTO(entity.getTagid(), entity.getTagname());
    }
}
