import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test

    public void searchTestForFewMatches() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(20, "Gone with the wind", 500, "Mitchell");
        Book book2 = new Book(30, "And Quiet Flows the Don", 600, "Sholohov");
        Book book3 = new Book(5, "And Quiet Flows the Don", 700, "Sholohov");
        Smartphone phone = new Smartphone(7, "Samsumg", 1000, "Korea");
        manager.save(book1);
        manager.save(book2);
        manager.save(book3);
        manager.save(phone);

        Product[] expected = {book2, book3};
        Product[] actual = manager.searchBy("Don");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void searchTestForOneMatches() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(20, "Gone with the wind", 500, "Mitchell");
        Book book2 = new Book(30, "And Quiet Flows the Don", 600, "Sholohov");
        Book book3 = new Book(5, "And Quiet Flows the Don", 700, "Sholohov");
        Smartphone phone = new Smartphone(7, "Samsumg", 1000, "Korea");
        manager.save(book1);
        manager.save(book2);
        manager.save(book3);
        manager.save(phone);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("wind");

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test

    public void searchTestForNoMatches() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(20, "Gone with the wind", 500, "Mitchell");
        Book book2 = new Book(30, "And Quiet Flows the Don", 600, "Sholohov");
        Book book3 = new Book(5, "And Quiet Flows the Don", 700, "Sholohov");
        Smartphone phone = new Smartphone(7, "Samsumg", 1000, "Korea");
        manager.save(book1);
        manager.save(book2);
        manager.save(book3);
        manager.save(phone);

        Product[] expected = {};
        Product[] actual = manager.searchBy("war");

        Assertions.assertArrayEquals(expected, actual);

    }


}