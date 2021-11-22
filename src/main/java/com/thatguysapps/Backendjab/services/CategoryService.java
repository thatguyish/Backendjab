package com.thatguysapps.Backendjab.services;

import com.thatguysapps.Backendjab.models.Book;
import com.thatguysapps.Backendjab.models.Category;
import com.thatguysapps.Backendjab.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    public List<Book> getBooksByCategory(Long id) {
        return categoryRepository.findById(id).get().getBooks();
    }

    public Category addCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }

    public String deleteCategory(Long id) {
        categoryRepository.deleteById(id);
        return "Deleted";
    }

    public Category updateCategory(Long id, Category category) {
        category.setId(id);
        categoryRepository.save(category);
        return category;
    }
}


