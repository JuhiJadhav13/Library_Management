package com.librarydemo.librarymanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarydemo.librarymanagement.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}