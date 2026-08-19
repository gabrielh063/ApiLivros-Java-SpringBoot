package com.example.api_exemplo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @JsonProperty("titulo")
    private String title;

    @JsonProperty("autor")
    private String author;

    @JsonProperty("area")
    private String area;

    @JsonProperty("imagem")
    private String image;

    @JsonProperty("editora")
    private String publisher;

    @JsonProperty("ano_publicacao")
    private String yearOfPublish;

    @JsonProperty("isbn")
    private String isbn;
}