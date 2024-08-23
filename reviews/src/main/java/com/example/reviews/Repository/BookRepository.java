package com.example.reviews.Repository;

import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.reviews.Model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, ObjectId>{
	Optional<Book> findBookByGrId(String GrId);
}