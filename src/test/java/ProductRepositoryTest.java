import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {
    @Test

    public void shouldRemoveByIdProduct() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(20, "Gone with the wind", 500, "Mitchell");
        Book book2 = new Book(30, "And Quiet Flows the Don", 600, "Sholohov");
        Book book3 = new Book(5, "And Quiet Flows the Don", 700, "Sholohov");
        Smartphone phone1 = new Smartphone(7, "Samsumg", 1000, "Korea");
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(phone1);

        repo.removeById(7);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindALlProduct() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(20, "Gone with the wind", 500, "Mitchell");
        Book book2 = new Book(30, "And Quiet Flows the Don", 600, "Sholohov");
        Book book3 = new Book(5, "And Quiet Flows the Don", 700, "Sholohov");
        Smartphone phone1 = new Smartphone(7, "Samsumg", 1000, "Korea");
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(phone1);

        Product[] expected = {book1, book2, book3, phone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}
