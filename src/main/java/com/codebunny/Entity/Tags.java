package com.codebunny.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "tags")
public class Tags {
    @Id
    private Integer tagId;
    private String tags;
}
