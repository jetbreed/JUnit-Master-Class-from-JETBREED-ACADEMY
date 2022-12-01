package Activity5_3_Using_Mockito;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MyShoppingCart {
    private String cartName;
    private MyStore store = null;
    private List<ShoppingItem> items = new ArrayList();

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public MyStore getStore() {
        return store;
    }

    public void setStore(MyStore store) {
        this.store = store;
    }

    public List<ShoppingItem> getItems() {
        return items;
    }

    public void setItems(List<ShoppingItem> items) {
        this.items = items;
    }

//    ------------------------------------

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public Double calculateTotalPrice() {
        Double totalPrice = 0.0;

        for (ShoppingItem item : this.items) {
            totalPrice += (store.getPrice(item.getItemName()) *
                    item.getQuantity());
        }
            DecimalFormat decimalFormat = new DecimalFormat("0.00");

            Double price = Double.parseDouble(decimalFormat.format(totalPrice));

            return price;
        }

}