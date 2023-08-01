package com.graphql.learn.graphqldemo.services;

import com.graphql.learn.graphqldemo.entites.Book;
import com.graphql.learn.graphqldemo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookserviceImpl implements Bookservice{
    private BookRepo bookRepo;

    @Autowired
    public BookserviceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(()-> new RuntimeException("Book not found"));
    }
}
