package com.example.api_exemplo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.api_exemplo.domain.BookResponse;

@FeignClient(name = "book-client", url = "https://books-api-685538571201-sa-east-1-an.s3.sa-east-1.amazonaws.com/")
public interface BookClient {

    @GetMapping("/books.json")
    BookResponse getBooks();
}