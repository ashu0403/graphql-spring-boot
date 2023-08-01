package com.graphql.learn.graphqldemo.controller;

import com.graphql.learn.graphqldemo.entites.Book;
import com.graphql.learn.graphqldemo.services.Bookservice;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BookController {
    private Bookservice bookservice;

    @Autowired
    public BookController(Bookservice bookservice) {
        this.bookservice = bookservice;
    }

    //create
@MutationMapping("createBook")
    public Book create(@Argument BookInput book) {
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        return this.bookservice.create(b);
    }

    //get all
@QueryMapping("allBooks")
    public List<Book> getAll() {
        return this.bookservice.getAll();
    }

    //get single book
@QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        return this.bookservice.get(bookId);
    }

}
@Getter
@Setter
class BookInput{
    private String title;
    private String author;
    private String desc;
    private double price;
    private int pages;
}