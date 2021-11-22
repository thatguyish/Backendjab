package com.thatguysapps.Backendjab.repository;

import com.thatguysapps.Backendjab.models.Book;
import com.thatguysapps.Backendjab.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
//findBooksByBookPublishersPublisherId(Long publisherId)
    List<Book> findByNameContaining(String name);

}
