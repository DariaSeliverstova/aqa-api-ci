import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Manager.ProductManager;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.repository.RepositoryProduct;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest{

    private ProductManager manager = new ProductManager(new RepositoryProduct());
    private Book first = new Book(   "Moi Dodir", 2, 300, "Chaikovskii");
    private Book second = new Book("Fly Tsikotuha", 1,250,"Chaikovskii");
    private Book third = new Book("Stolen sun",0,450,"Chaikovskii");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }
    
    @Test
    public void shouldSaveBook() {

        Book searchByBook = first;
        manager.searchBy(searchByBook);



        Product[] actual = manager.searchBy(searchByBook);
        Product[] expected = new Product[] {first};

        assertArrayEquals(expected, actual);
    }
}









