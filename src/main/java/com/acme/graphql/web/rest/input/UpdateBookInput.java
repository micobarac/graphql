package com.acme.graphql.web.rest.input;

import com.acme.graphql.domain.Author;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class UpdateBookInput {
    @Id
    private Long id;

    private Integer pages;

    public UpdateBookInput() {
    }

    public UpdateBookInput(Long id, int pages) {
        this.id = id;
        this.pages = pages;
    }
}
