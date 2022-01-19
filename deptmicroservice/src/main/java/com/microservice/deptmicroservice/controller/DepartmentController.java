package com.microservice.deptmicroservice.controller;

import com.microservice.deptmicroservice.model.Book;
import com.microservice.deptmicroservice.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/books")
    public Book getBook(){
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("Test");
        return deptService.setUser(book);
    }

}
