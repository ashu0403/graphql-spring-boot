package com.graphql.learn.graphqldemo.services;

import com.graphql.learn.graphqldemo.entites.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Bookservice {
    Book create(Book book);
    List<Book> getAll();
    Book get(int bookId);

}
