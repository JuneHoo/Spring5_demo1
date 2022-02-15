package spring5.dao;


import spring5.entity.Book;

import java.util.List;

public interface BookDao {
    void add(Book book);


    void updateBook(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    public void batchAdd(List<Object[]> batchArgs);

    public void batchUpdate(List<Object[]> batchArgs);

    public void batchDelete(List<Object[]> batchArgs);



}
