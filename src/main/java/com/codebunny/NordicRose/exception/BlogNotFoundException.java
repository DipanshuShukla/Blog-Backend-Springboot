package com.codebunny.NordicRose.exception;

public class BlogNotFoundException extends RuntimeException{
    public BlogNotFoundException(String message){
        super(message);
    }
}
