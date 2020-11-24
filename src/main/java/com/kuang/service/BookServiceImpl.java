package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/21 19:47
 */
public class BookServiceImpl implements BookService {
    private BookMapper mapper;

    public void setMapper(BookMapper mapper) {
        this.mapper = mapper;
    }

    public int addBook(Books books) {
        return mapper.addBook(books);
    }

    public int deleteBook(int bookID) {
        return mapper.deleteBook(bookID);
    }

    public int updateBook(Books books) {
        return mapper.updateBook(books);
    }

    public Books queryBook(int id) {
        return mapper.queryBook(id);
    }

    public List<Books> findAllBooks() {
        return mapper.findAllBooks();
    }
}
