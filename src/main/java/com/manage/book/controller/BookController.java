package com.manage.book.controller;

import com.manage.book.dto.BookInfoDto;
import com.manage.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    // 도서 정보를 저장한다.
    @PostMapping("/book")
    public ResponseEntity<Long> registerBook(BookInfoDto bookInfoDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        bookService.registerBook(bookInfoDto);
        return new ResponseEntity<Long>(, httpHeaders, HttpStatus.OK);
    }
}
