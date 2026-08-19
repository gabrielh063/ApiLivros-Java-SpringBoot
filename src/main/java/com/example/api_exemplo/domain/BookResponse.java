package com.example.api_exemplo.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BookResponse(
    @JsonProperty("livros") List<Book> livros
) {}