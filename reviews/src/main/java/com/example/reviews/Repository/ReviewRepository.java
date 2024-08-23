package com.example.reviews.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.reviews.Model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
