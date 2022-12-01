package Activity5_1_Implementing_Stubs;

public class StubBookDAO implements IBookDAO{
    @Override
    public boolean saveBookDetails(Book newBook) {
        return true;
    }
}
