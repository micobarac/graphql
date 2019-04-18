package com.acme.graphql.repository;

import com.acme.graphql.domain.Author;
import com.acme.graphql.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(Author author);
}
