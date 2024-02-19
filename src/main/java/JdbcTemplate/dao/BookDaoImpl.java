package JdbcTemplate.dao;


import JdbcTemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCountCallbackHandler;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 #Create by LCK on 2021/12/19  19:02
 */
@Repository
public class BookDaoImpl implements BookDao {
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addBook(Book book) {
        String sql = "insert into user values (?,?,?)";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }

    @Override
    public void deleteBook(Integer id) {
        String sql  = "delete from user  where user_id = ?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update user set user_id = ?,username = ?,ustatus = ?";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }

    @Override
    public Book queryBookById(String id) {
        String sql  = "select * from book where bookId  = ?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
    }


    @Override
    public int selectCount() {
        String sql  = "select count(*) from user";
        return jdbcTemplate.queryForObject(sql,int.class);
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));

    }



}
