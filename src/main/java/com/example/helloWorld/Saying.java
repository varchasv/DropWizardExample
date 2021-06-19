package com.example.helloWorld;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {
    private long id;

    @JsonProperty
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
