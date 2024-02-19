import JdbcTemplate.entity.Book;
import JdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 #Create by LCK on 2021/12/19  19:25
 */
public class BookTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplate.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book();
//        book.setUserId("3");
//        book.setUsername("java");
//        book.setUstatus("www");
//        bookService.addBook(book);
//
//        bookService.updateBook(book);

//        bookService.deleteBook(1);
        System.out.println(bookService.selectCount());
        System.out.println(bookService.queryBookById("6"));

        //查询返回对象
//        Book book = bookService.queryBookById("2");
//        System.out.println(book);

        System.out.println(bookService.queryBooks());

    }
}
