package com.example.demo;


public class Greeting {
     int id;
     String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
