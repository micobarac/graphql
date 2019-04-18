package com.acme.graphql.web.rest.resolver;

import com.acme.graphql.domain.Pet;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PetResolver implements GraphQLResolver<Pet> { }
