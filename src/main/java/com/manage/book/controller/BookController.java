package com.manage.book.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    // 책의 아이디 발급을 어떻게 해야 할까?
    // 바코드 발급 api? 를 만든다?
    @PostMapping("")
    public ResponseEntity<?> registerBook() {
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<Long>(, httpHeaders, HttpStatus.OK);
    }
}
