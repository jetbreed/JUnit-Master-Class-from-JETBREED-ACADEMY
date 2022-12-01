package Activity5_1_Implementing_Stubs;

//import jdk.jshell.spi.ExecutionControl;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BookDAO implements IBookDAO{
    @Override
    public boolean saveBookDetails(Book newBook) {
        return true;
//        throw new NotImplementedException();
    }
}
