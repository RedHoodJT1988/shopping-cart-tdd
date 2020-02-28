package shopping.cart.cart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    // Given that I visit the site, when I begin shopping, then I expect my cart to be empty
    @Test
    public void EmptyCart() {
        //Setup
        Cart cart;
        // Execute
        cart = new Cart();
    }

    // Given that I have an empty cart, when I add an item, then I expect to getTotalPrice() reflect the sum
    // of all the Items in my cart, times the quantites of each item
    @Test
    public void AddItemsToCart() {
        Cart cart = new Cart();

        Item item1 = new Item("Louis Vatton Handbag", 450.99);
        Item item2 = new Item("Gucci Belt", 300.00);

        cart.AddItem(item1);
        assertEquals(450.99, cart.getTotalPrice());

        cart.AddItem(item2);
        assertEquals(750.99, cart.getTotalPrice());
    }
}
