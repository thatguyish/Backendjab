package com.thatguysapps.Backendjab.controllers;

import com.thatguysapps.Backendjab.models.Category;
import com.thatguysapps.Backendjab.services.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    @GetMapping("/{categoryId}/books")
    public ResponseEntity<?> getBooksByCategory(@PathVariable Long categoryId) {

        return new ResponseEntity<>(categoryService.getBooksByCategory(categoryId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addCategory(@RequestBody Category category){
        return new ResponseEntity<>(categoryService.addCategory(category),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable Long id, @RequestBody Category category){
        return ResponseEntity.ok(categoryService.updateCategory(id,category));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.deleteCategory(id));
    }

}
