package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai7BookModel;
import com.Cybersoft.BaiTapSBLesson11.Service.Bai7BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Bai7BookController {

    private final Bai7BookService bookService;

    public Bai7BookController(Bai7BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/search")
    public List<Bai7BookModel> bai7SearchBooksByAuthor(
            @RequestParam String author) {

        return bookService.searchBooksByAuthor(author);
    }
}