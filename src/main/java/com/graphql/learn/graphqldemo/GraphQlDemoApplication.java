package com.graphql.learn.graphqldemo;

import com.graphql.learn.graphqldemo.entites.Book;
import com.graphql.learn.graphqldemo.services.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlDemoApplication implements CommandLineRunner {
    @Autowired
    private Bookservice bookservice;
    public static void main(String[] args) {
        SpringApplication.run(GraphQlDemoApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();
        b1.setTitle("Harry Potter");
        b1.setPrice(100);
        b1.setPages(200);
        b1.setDesc("Harry Potter is a series of fantasy novels written by British author J. K. Rowling.");
        b1.setAuthor("J. K. Rowling");

        Book b2 = new Book();
        b2.setTitle("Revenge of Geography");
        b2.setPrice(1222);
        b2.setPages(350);
        b2.setDesc("Revenge of Geography is a novel by American author Robert A. Heinlein.");
        b2.setAuthor("Robert Kaplan");
        Book b3 = new Book();
        b3.setTitle("The Lord of the Rings");
        b3.setPrice(2422);
        b3.setPages(332);
        b3.setDesc("The Lord of the Rings is a series of fantasy novels written by English author J. R. R. Tolkien.");
        b3.setAuthor("Tolkien");

this.bookservice.create(b1);
this.bookservice.create(b2);
this.bookservice.create(b3);

    }

}
