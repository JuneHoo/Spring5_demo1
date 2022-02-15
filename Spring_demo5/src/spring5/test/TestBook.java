package spring5.test;

import javafx.scene.chart.BarChart;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.entity.Book;
import spring5.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
////        book.setUsername("java");
//        bookService.addBook(book);
//
//        book.setUsername("1");
//        book.setUsername("Python");
//        book.setUstatus("atguigu");
//        bookService.update(book);

        int count = bookService.findCount();
        System.out.println(count);

        Book book1 = bookService.findOne("2");
        System.out.println(book1);

        List<Book> all = bookService.findAll();
        System.out.println(all);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3", "java", "A"};
//        Object[] o2 = {"4", "C++", "b"};
//        Object[] o3 = {"5", "MySQL", "c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"java0909", "A3", "3"};
//        Object[] o2 = {"C++1010", "b4","4"};
//        Object[] o3 = {"MySQL1111", "c5", "5",};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
//        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);


    }
}
