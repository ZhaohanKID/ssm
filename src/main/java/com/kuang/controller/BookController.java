package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ Author: Z.HAN
 * @ Date: 2020/11/21 21:01
 */
@Controller
public class BookController {

    // 注意：有点忘记了controller是调用service层的
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String findAllBook(Model model) {

        List<Books> books = bookService.findAllBooks();
        model.addAttribute("allBook", books);

        return "allBook";
    }

    @RequestMapping("/addBook")
    public String toAddPage(Books books) {

        System.out.println("接收到的参数是：" + books);

        // 获取前端提交过来的参数
        bookService.addBook(books);

        return "redirect:/allBook";
    }


}
