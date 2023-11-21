package com.codebunny.NordicRose.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "tags")
public class Tags {
    @Id
    private Integer tagid;
    private String tagname;

    public Tags() {
    }

    public Tags(Integer tagid, String tagname) {
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
}
