package com.example.a1;

public class site {
    private String name;
    private String url;

    public site(String name , String url) {
        this.name = name;
        this.url = url ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return name ;
    }
}
