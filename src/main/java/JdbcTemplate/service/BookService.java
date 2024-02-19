package JdbcTemplate.service;

import JdbcTemplate.dao.BookDao;
import JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 #Create by LCK on 2021/12/19  19:02
 */
@Service
public class BookService {
    /*注入dao*/
    @Autowired
    private BookDao bookDao;


    public void addBook(Book book){
        bookDao.addBook(book);
    }
    public void deleteBook(Integer id){
        bookDao.deleteBook(id);
    }
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    public int selectCount(){
        return bookDao.selectCount();
    }
    public Book queryBookById(String id){
        return bookDao.queryBookById(id);
    }

    public List<Book> queryBooks(){
        return  bookDao.queryBooks();
    }
}
