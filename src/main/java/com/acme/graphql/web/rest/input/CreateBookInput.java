package com.acme.graphql.web.rest.input;

import com.acme.graphql.domain.Author;
import lombok.Data;

@Data
public class CreateBookInput {
    private String title;

    private String isbn;

    private Integer pages;

    private Author author;

    public CreateBookInput() {
    }

    public CreateBookInput(String title, String isbn, int pages, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.pages = pages;
        this.author = author;
    }
}
