package com.olive.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olive.model.Book;


public interface ProductRepo extends MongoRepository<Book, Integer> {

}
