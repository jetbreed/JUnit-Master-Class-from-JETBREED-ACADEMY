package Activity5_1_Implementing_Stubs;

import java.util.Arrays;

public class BookManager {
    IBookDAO bookDAO = null;

    Book newBook = new Book("112345", "Programming in Java",
            Arrays.asList("Andrew", "Ferguson"), "New Publication",
            2022);

    public BookManager() {
        bookDAO = new BookDAO();
    }

    public BookManager(IBookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public boolean save(Book newBook){
        return (bookDAO.saveBookDetails(newBook));
    }
}
