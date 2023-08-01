package com.graphql.learn.graphqldemo.repository;

import com.graphql.learn.graphqldemo.entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
