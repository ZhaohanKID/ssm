package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/21 19:31
 */
public interface BookMapper {
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
