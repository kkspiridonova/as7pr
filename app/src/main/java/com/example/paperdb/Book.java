package com.example.paperdb;

public class Book {
    private String id;
    private String title;
    private String author;
}
public Book (String id, String title){
    this.title = title;
    this.author = author;
    this.id = id;
}

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}


