package com.kuang.test;

import com.kuang.pojo.Books;
import com.kuang.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/24 18:45
 */
public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("bookServiceImpl", BookServiceImpl.class);
        List<Books> allBooks = bookServiceImpl.findAllBooks();
        for (Books book : allBooks) {
            System.out.println(book);
        }
    }
}
