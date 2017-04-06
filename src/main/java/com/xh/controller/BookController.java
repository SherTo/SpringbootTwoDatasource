package com.xh.controller;

import com.xh.bean.s.Book;
import com.xh.dev.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/12/27.
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/add")
    public Book addBook() {
        Book book = new Book("java",11);
        return bookRepository.save(book);
    }
}
