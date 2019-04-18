package com.acme.graphql.repository;

import com.acme.graphql.domain.Author;
import com.acme.graphql.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByBooks(Book book);
}
