package Activity5_1;

import Activity5_1_Implementing_Stubs.Book;
import Activity5_1_Implementing_Stubs.BookDAO;
import Activity5_1_Implementing_Stubs.BookManager;
import Activity5_1_Implementing_Stubs.StubBookDAO;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BookManagerTest {
    @Test
    public void TestBookManager()
    {
        StubBookDAO stubBookDAO = new StubBookDAO();
//        BookDAO  bookDAO = new BookDAO();

        BookManager bookManager = new BookManager(stubBookDAO);
//        BookManager bookManager1 = new BookManager(bookDAO);

        boolean result = bookManager
                .save(new Book("112345", "Programming in Java",
                Arrays.asList("Andrew", "Ferguson"), "New Publication",
                2022));
        Assert.assertEquals(true, result);
    }

}
