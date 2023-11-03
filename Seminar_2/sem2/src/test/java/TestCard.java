
import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static simple_shopping_cart.Main.*;

import java.io.IOException;

import javax.lang.model.element.UnknownElementException;

import static org.assertj.core.api.Assertions.*;
// import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import simple_shopping_cart.Cart;
import simple_shopping_cart.Shop;

public class TestCard {

    @Test
    public void testPriceCard() {
        Shop shop = new Shop(getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);
        assertEquals(620.00d, cart.getTotalPrice());
    }

    @Test
    public void testPriceMultiCard() {
        Shop shop = new Shop(getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        assertEquals(510.00d, cart.getTotalPrice());

    }

    @Test
    public void testPriceDelCard() {
        Shop shop = new Shop(getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(2);
        cart.addProductToCartByID(3);
        cart.removeProductByID(1);
        // assertEquals(450.00d, cart.getTotalPrice());
        assertThat(cart.getTotalPrice()).isEqualTo(450.00d);

    }

    @Test
    public void testPriceMoveCard() {
        Shop shop = new Shop(getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(7);

    }

    @Test
    public void testPriceMoveAllCard() {
        Shop shop = new Shop(getStoreItems());
        Cart cart = new Cart(shop);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.addProductToCartByID(1);
        cart.removeProductByID(1);
        assertThat(shop.getProductsShop().get(0).getQuantity()).isEqualTo(1);
        assertThat(cart.cartItems.get(0).getQuantity()).isEqualTo(9);

    }

    // @ParameterizedTest
    // @ValueSource(ints = { -1, 0, 50000, -100 })
    // public void testCorrectIndexCard(int id) {
    // Shop shop = new Shop(getStoreItems());
    // Cart cart = new Cart(shop);
    // assertThat(cart.addProductToCartByID(id), new RuntimeException());
    // }

}
