package com.thatguysapps.Backendjab.services;

import com.thatguysapps.Backendjab.models.Book;
import com.thatguysapps.Backendjab.models.Category;
import com.thatguysapps.Backendjab.repository.BookRepository;
import com.thatguysapps.Backendjab.repository.CategoryRepository;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.getById(id);
    }

    public List<Category> getAllCategoriesByBookId(Long id){
        return bookRepository.getById(id).getCategories();
    }

    public Book addBook(Book book) {
        Book repobook = bookRepository.save(book);
        return repobook;
    }

    public Book updateBook(Long id, Book book) {
        book.setId(id);
        bookRepository.save(book);
        return book;
    }

    public String deleteBookById(Long id) {
        bookRepository.deleteById(id);
        return "Deleted";
    }
     public List<Book> searchBooksByName(String name) {
        return bookRepository.findByNameContaining(name);
    }

    public Book addBookToCategory(Long bookId, Long categoryId){
        Category category = categoryRepository.getById(categoryId);
        Book book = bookRepository.getById(bookId);

        book.getCategories().add(category);
        bookRepository.save(book);
        return null;

    }

}


