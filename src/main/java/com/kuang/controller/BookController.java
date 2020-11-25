package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    // 添加书籍
    @RequestMapping("/addBook")
    public String toAddPage(Books books) {

        System.out.println("接收到的参数是：" + books);

        // 获取前端提交过来的参数
        bookService.addBook(books);

        return "redirect:/allBook";
    }

    // 修改书籍信息
    @RequestMapping("/toUpdatePaper")
    public String toUpdatePaper(int id, Model model) {
        Books books = bookService.queryBook(id);
        System.out.println("QBook" + books);
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        // 注意点：修改操作之后务必要提交事务(如果是这样测试，
        // 会发现控制台打印出的信息正确，但是数据库的信息没有被成功修改)
        System.out.println("这里这里：" + books);
        return "redirect:/allBook";
    }

    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {
        bookService.deleteBook(id);
        return "redirect:/allBook";
    }

}
