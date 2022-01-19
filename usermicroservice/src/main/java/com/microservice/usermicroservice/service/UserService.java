package com.microservice.usermicroservice.service;

import com.microservice.usermicroservice.VO.Book;
import com.microservice.usermicroservice.VO.ResponseTemplateVO;
import com.microservice.usermicroservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseTemplateVO getBook(int userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = new User();
        user.setUserID(userId);
        user.setUserName("Sherin");

        Book book = restTemplate.getForObject("http://DEPARTMENT-SERVICE/books", Book.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setBook(book);
        return responseTemplateVO;
    }
}
