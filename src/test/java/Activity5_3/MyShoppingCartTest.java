package Activity5_3;

import Activity5_3_Using_Mockito.MyShoppingCart;
import Activity5_3_Using_Mockito.MyStore;
import Activity5_3_Using_Mockito.ShoppingItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyShoppingCartTest {
    
    public MyShoppingCartTest() {
    }
    
    public MyShoppingCart cart = null;
    public MyStore storeMock = null;
 
    @Before
    public void setUp() {
    storeMock = Mockito.mock(MyStore.class);
    cart = new MyShoppingCart();
    cart.setStore(storeMock);
    }
    //Check the number of interactions with mock objects
    @Test
    public void testCountNumberOfInteractions() throws Exception {
        ShoppingItem shoppingItem = new ShoppingItem("IPhone", 2);
        cart.addItem(shoppingItem);
        double total = cart.calculateTotalPrice();
        //Verify the number of interactions with mock
        Mockito.verify(storeMock, Mockito.times(1))
                .getPrice(shoppingItem.getItemName());
        //Ensure that there was only one interaction with service
        Mockito.verifyNoMoreInteractions(storeMock);
    }

    @Test
    public void testCalculateTotalPrice() throws Exception {
        ShoppingItem stubbedItem = new ShoppingItem("Speakers", 5);
        Mockito.when(storeMock.getPrice("Speakers"))
                .thenReturn(100.00);
        cart.addItem(stubbedItem);
        //Method call
        double totalPrice = cart.calculateTotalPrice();
        //Verify if method was invoked
        Mockito.verify(storeMock).getPrice("Speakers");
        Assert.assertEquals(500, totalPrice, 0);
    }
}
