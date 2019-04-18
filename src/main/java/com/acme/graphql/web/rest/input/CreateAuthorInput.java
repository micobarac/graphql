package com.acme.graphql.web.rest.input;

import lombok.Data;

@Data
public class CreateAuthorInput {
    private String firstName;

    private String lastName;

    public CreateAuthorInput() {
    }

    public CreateAuthorInput(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
