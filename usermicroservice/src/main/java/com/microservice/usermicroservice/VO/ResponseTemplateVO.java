package com.microservice.usermicroservice.VO;

import com.microservice.usermicroservice.model.User;

public class ResponseTemplateVO {
    private Book book;
    private User user;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
