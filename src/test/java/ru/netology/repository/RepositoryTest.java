package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.NotFoundException;
import ru.netology.domain.Product;
import ru.netology.domain.Book;
import ru.netology.domain.TShirt;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();
    Book book1 = new Book(1, "Windows", 25, "Torvalds");
    Book book2 = new Book(2, "Windows", 20, "Gates");
    Book book3 = new Book(3, "Android", 40, "Rubin");
    TShirt tshirt1 = new TShirt(4, "TShirt1", 100, "Crocs");
    TShirt tshirt2 = new TShirt(5, "TShirt2", 200, "Lamoda");
    TShirt tshirt3 = new TShirt(6, "TShirt3", 300, "Nike");

    @BeforeEach
    public void setUp() {
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(tshirt1);
        repo.save(tshirt2);
        repo.save(tshirt3);
    }

    @Test
    void shouldRemoveByExistingElement() {
        Product[] actual = repo.removeById(2);
        Product[] expected = new Product[]{book1, book3, tshirt1, tshirt2, tshirt3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByNonExistingElement() {
        assertThrows(NotFoundException.class, () -> {
            repo.removeById(10);
        });
    }
}