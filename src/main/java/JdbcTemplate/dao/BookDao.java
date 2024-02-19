package JdbcTemplate.dao;

import JdbcTemplate.entity.Book;

import java.util.List;

/***
 #Create by LCK on 2021/12/19  19:02
 */
public interface BookDao {
    void addBook(Book book);

    void deleteBook(Integer id);

    void updateBook(Book book);

    Book queryBookById(String id);
    int selectCount();

    List<Book> queryBooks();
}
