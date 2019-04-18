package com.acme.graphql.web.rest.resolver;

import com.acme.graphql.domain.Pet;
import com.acme.graphql.repository.PetRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PetRootResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final PetRepository petRepository;

    public Iterable<Pet> findAllPets() {
        return petRepository.findAll();
    }
    public long countPets() {
        return petRepository.count();
    }
}
