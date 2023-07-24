package Activity5_1_Implementing_Stubs;

public interface IBookDAO {
    public boolean saveBookDetails(Book newBook);
    public boolean updateBookDetails(Book newBook);
    public boolean viewBookDetails(Book newBook);
    public boolean deleteBookDetails(Book newBook);
}
