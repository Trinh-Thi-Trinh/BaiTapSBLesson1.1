package com.Cybersoft.BaiTapSBLesson11.Service;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai7BookModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Bai7BookService {

    private final List<Bai7BookModel> books = new ArrayList<>();

    public Bai7BookService() {
        books.add(new Bai7BookModel(1, "Java Basic", "Nguyen Van A"));
        books.add(new Bai7BookModel(2, "Spring Boot", "Nguyen Van B"));
        books.add(new Bai7BookModel(3, "Java Advanced", "Nguyen Van A"));
        books.add(new Bai7BookModel(4, "Python Basic", "Nguyen Van C"));
    }

    public List<Bai7BookModel> searchBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor()
                        .equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}