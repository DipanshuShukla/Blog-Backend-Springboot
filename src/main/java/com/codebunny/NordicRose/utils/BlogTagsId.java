package com.codebunny.NordicRose.utils;


import java.io.Serializable;

public class BlogTagsId implements Serializable {
    private Integer blogid;
    private Integer tagid;
    public BlogTagsId(Integer blogid, Integer tagid){
        this.blogid = blogid;
        this.tagid = tagid;
    }
}
