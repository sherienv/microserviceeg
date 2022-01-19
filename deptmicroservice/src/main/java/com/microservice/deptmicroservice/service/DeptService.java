package com.microservice.deptmicroservice.service;

import com.microservice.deptmicroservice.model.Book;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

    public Book setUser(Book book) {
          return book;
    }
}
