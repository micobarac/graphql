package com.acme.graphql.web.rest.resolver;

import com.acme.graphql.domain.Author;
import com.acme.graphql.repository.AuthorRepository;
import com.acme.graphql.web.rest.input.CreateAuthorInput;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorRootResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final AuthorRepository authorRepository;

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
    public long countAuthors() { return authorRepository.count(); }

    public Author newAuthor(CreateAuthorInput input) {
        Author author = new Author();
        author.setFirstName(input.getFirstName());
        author.setLastName(input.getLastName());

        authorRepository.save(author);

        return author;
    }
}
