package com.acme.graphql.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String isbn;

    private Integer pages;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false, updatable = false)
    @JsonBackReference
    private Author author;

    public Book() {
    }

    public Book(String title, String isbn, int pages, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.pages = pages;
        this.author = author;
    }
}
