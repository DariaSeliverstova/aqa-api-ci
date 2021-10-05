package ru.netology.Manager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.RepositoryProduct;

public class ProductManager {
    private RepositoryProduct repository;

    public ProductManager(RepositoryProduct repository) {
        this.repository = repository;
    }

    public ProductManager() {
    }

    public void add(Product item) {
        repository.save(item);
    }


    public Product[] searchBy(Book text) {
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;

    }


    public boolean matches(Product product, Book search) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getAvtor().contains(search)) {
                return true;
            }
            if (book.getName().contains(search)) {
                return true;
            }

            return false;
        }
        if (product instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) product;
            if (smartphone.getProduction().contains(search)) {
                return true;
            }
            if (smartphone.getName().contains(search)) {
                return true;
            }

            return false;
        }

        return false;
    }
}

