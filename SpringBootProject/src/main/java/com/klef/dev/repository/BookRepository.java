package com.klef.dev.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klef.dev.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> 
{
    Book findByTitle(String title);
    Optional<Book> findById(Integer id);
}
