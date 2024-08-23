package com.example.reviews.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.reviews.Model.Book;
import com.example.reviews.Repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
    public Optional<Book> findBookByGrId(String grId) {
        return bookRepository.findBookByGrId(grId);
    }
}