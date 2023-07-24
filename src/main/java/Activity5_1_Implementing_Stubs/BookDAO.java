package Activity5_1_Implementing_Stubs;

//import jdk.jshell.spi.ExecutionControl;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BookDAO implements IBookDAO{
    @Override
    public boolean saveBookDetails(Book newBook) {
//        return true;
//        throw new NotImplementedException();
//        connect to the database
//        locate the table in the database
//        save(table);
        return true;
    }

    @Override
    public boolean updateBookDetails(Book newBook) {
        return false;
    }

    @Override
    public boolean viewBookDetails(Book newBook) {
        return false;
    }

    @Override
    public boolean deleteBookDetails(Book newBook) {
        return false;
    }
}
