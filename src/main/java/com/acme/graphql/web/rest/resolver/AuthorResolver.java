package com.acme.graphql.web.rest.resolver;

import com.acme.graphql.domain.Author;
import com.acme.graphql.domain.Book;
import com.acme.graphql.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
    private final BookRepository bookRepository;

    public List<Book> getBooks(Author author) {
        return bookRepository.findByAuthor(author);
    }
}
