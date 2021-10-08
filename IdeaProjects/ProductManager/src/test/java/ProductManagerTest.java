import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Manager.ProductManager;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.RepositoryProduct;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {

    private ProductManager manager = new ProductManager(new RepositoryProduct());
    private Book first = new Book("Moi Dodir", 2, 300, "Chukovskii","Noname");
    private Book second = new Book("Fly Tsikotuha", 1, 250, "Chukovskii","Noname" );
    private Book third = new Book("Green Apply", 0, 450, "Matie","Noname");
    private Book fourth = new Book("100 polet",15,250,"Kulich","101");
    private Smartphone three = new Smartphone("100",8,10101,"Hawai","101");
    private Smartphone one = new Smartphone("223",1,12364,"Apply","NoSuper");
    private Smartphone two = new Smartphone("222",2,11111,"Sumsung","Super");


    @BeforeEach
    public void setUp() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(one);
        manager.add(two);
        manager.add(fourth);
        manager.add(three);
    }

    @Test
    public void shouldSaveBookName() {



        manager.searchBy("Moi Dodir");


        Product[] actual = manager.searchBy("Moi Dodir");
        Product[] expected = new Product[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveBookAvtor() {



        manager.searchBy("Chukovskii");


        Product[] actual = manager.searchBy("Chukovskii");
        Product[] expected = new Product[]{first, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveSmartphoneName() {


        manager.searchBy("223");


        Product[] actual = manager.searchBy("223");
        Product[] expected = new Product[]{one};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSaveSmartphoneProduction() {


        manager.searchBy("Sumsung");


        Product[] actual = manager.searchBy("Sumsung");
        Product[] expected = new Product[]{two};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveSmartphoneTittle() {


        manager.searchBy("Super");


        Product[] actual = manager.searchBy("Super");
        Product[] expected = new Product[]{one, two};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveBookTittle() {


        manager.searchBy("Noname");


        Product[] actual = manager.searchBy("Noname");
        Product[] expected = new Product[]{first, second,third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveBookSmartphone() {


        manager.searchBy("100");


        Product[] actual = manager.searchBy("100");
        Product[] expected = new Product[]{fourth, three};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFalse() {


        manager.searchBy("154");


        Product[] actual = manager.searchBy("154");
        Product[] expected = new Product[]{};

        assertArrayEquals(expected, actual);
    }


    }












