package com.acme.graphql.web.rest.resolver;

import com.acme.graphql.domain.Author;
import com.acme.graphql.domain.Book;
import com.acme.graphql.repository.BookRepository;
import com.acme.graphql.web.rest.errors.BookNotFoundException;
import com.acme.graphql.web.rest.input.CreateBookInput;
import com.acme.graphql.web.rest.input.UpdateBookInput;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookRootResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final BookRepository bookRepository;

    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }
    public long countBooks() { return bookRepository.count(); }

    public Book newBook(CreateBookInput input) {
        Book book = new Book();
        book.setAuthor(new Author(input.getAuthor().getId()));
        book.setTitle(input.getTitle());
        book.setIsbn(input.getIsbn());
        book.setPages(input.getPages() != null ? input.getPages() : 0);

        bookRepository.save(book);

        return book;
    }

    public boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return true;
    }

    public Book updateBookPages(UpdateBookInput input) {
        Book book = bookRepository.findById(input.getId()).orElseThrow(() -> new BookNotFoundException("The book to be updated was not found", input.getId()));
        book.setPages(input.getPages());
        bookRepository.save(book);

        return book;
    }
}
