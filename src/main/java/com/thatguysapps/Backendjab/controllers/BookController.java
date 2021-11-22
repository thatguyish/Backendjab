package com.thatguysapps.Backendjab.controllers;

import com.thatguysapps.Backendjab.models.Book;
import com.thatguysapps.Backendjab.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //Get request to get all books
    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.getBookById(id),HttpStatus.OK);

    }
    @GetMapping("/{id}/categories")
    public ResponseEntity<?> getAllCategoriesByBookId(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getAllCategoriesByBookId(id));
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchBooksByName(@RequestParam String query) {
        return new ResponseEntity<>(bookService.searchBooksByName(query),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.addBook(book),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody Book book) {
        return new ResponseEntity<>(bookService.updateBook(id,book),HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.deleteBookById(id),HttpStatus.OK);
    }

    @PutMapping("{id}/category/{categoryId}")
    public ResponseEntity<?> addBookToCategory(@PathVariable Long id, @PathVariable Long categoryId) {
        return new ResponseEntity<>(bookService.addBookToCategory(id,categoryId),HttpStatus.OK);
    }
    

}
