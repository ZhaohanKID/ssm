package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/21 19:47
 */
public interface BookService {
    // 增一本书
    int addBook(Books books);
    // 删一本书
    int deleteBook(@Param("id") int bookID);
    // 改一本书
    int updateBook(Books books);
    // 查一ben书
    Books queryBook(@Param("id") int id);
    // 查all书
    List<Books> findAllBooks();
}
