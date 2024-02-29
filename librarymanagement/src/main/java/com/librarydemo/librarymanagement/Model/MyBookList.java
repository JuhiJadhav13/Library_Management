package com.librarydemo.librarymanagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyBooks")
public class MyBookList {
    @Id
    
    private int id;
    private String name;
    private String author;
    public MyBookList(){
    	super();
    }

    public MyBookList(int id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
