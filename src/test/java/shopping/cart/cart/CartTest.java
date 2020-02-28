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
    // of all the Items in my cart, times the quantities of each item
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

    // Given I have an empty cart, when I add more than one of an item, then I expect itemQuantities() to show
    // the number of items I have added.
    @Test
    public void DisplayItemiziedList() {
        Cart cart = new Cart();
        assertEquals(cart.itemizedList(), Collections.EMPTY_LIST);

        Item item1 = new Item("Gucci Blazer", 250.00);
        Item item2 = new Item("Louis Vatton Sunglasses", 150.00);
        cart.AddItem(item1);
        cart.AddItem(item2);
        assertEquals(new ArrayList<String>(Arrays.asList("Gucci Blazer - $250.0", "Louis Vatton Sunglasses - $150.0")), cart.itemizedList());
    }

    // Given I have an empty cart, when I add items, then I expect itemizedList() reflect the items I have added
    // along with their price and quantity.
    @Test
    public void ShouldAllowMoreThanOneOfTheSameItemAddingToCart() {
        Cart cart = new Cart();

        Item item1 = new Item("Louis Vatton Handbag", 450.99);
        Item item2 = new Item("Gucci Belt", 300.00);

        cart.addItems(item1, 2);
        assertEquals(901.98, cart.getTotalPrice());
    }
    // Given I have an empty cart, when I add more than one of an item, then I expect getTotalPrice()
    // to reflect both the item price and quantity.

    // Given I have a cart with items that are not on sale, when I add items that are on sale, I expect
    // onSaleItems() to include only the items on sale.
}
