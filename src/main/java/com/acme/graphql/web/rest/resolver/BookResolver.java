package com.acme.graphql.web.rest.resolver;

import com.acme.graphql.domain.Author;
import com.acme.graphql.domain.Book;
import com.acme.graphql.repository.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@Component
@RequiredArgsConstructor
public class BookResolver implements GraphQLResolver<Book> {
    private final AuthorRepository authorRepository;

    public Author getAuthor(Book book) {
        return authorRepository.findByBooks(book).orElseThrow(EntityNotFoundException::new);
    }
}
