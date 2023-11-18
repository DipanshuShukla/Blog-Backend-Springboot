package com.codebunny.NordicRose.dto;

import com.codebunny.NordicRose.entity.NewsLetterSubscriber;

public class NewsLetterSubscriberDTO {
    private String email;

    public NewsLetterSubscriberDTO(String mail) {
        this.email = mail;
    }

    public NewsLetterSubscriberDTO() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static NewsLetterSubscriberDTO fromEntity(NewsLetterSubscriber entity){
        NewsLetterSubscriberDTO dto = new NewsLetterSubscriberDTO();
        dto.setEmail(entity.getEmail());
        return dto;
    }
}
