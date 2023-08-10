import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesTest {
    @Test
    public void ArrayZeroTest() {
        ManagerMovies manager = new ManagerMovies();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FilmsAddOneTest() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(" Вперёд ");
        String[] expected = {" Вперёд "};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FilmAddThreeTest() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        String[] expected = {" Блатшот ", " Вперёд ", " Отель Белград "};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FilmAddFifeTest() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        manager.add(" Джентельмены ");
        manager.add(" Человек-невидимка ");
        String[] expected = {" Блатшот ", " Вперёд ", " Отель Белград ", " Джентельмены ", " Человек-невидимка "};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        ManagerMovies manager = new ManagerMovies();
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        manager.add(" Джентельмены ");
        manager.add(" Человек-невидимка ");
        manager.add(" Тролли. Мировой тур ");
        manager.add(" Номер один ");
        String[] actual = manager.findLast();
        String[] expected = {" Номер один ", " Тролли. Мировой тур ", " Человек-невидимка ", " Джентельмены ", " Отель Белград "};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitThreeTest() {
        ManagerMovies manager = new ManagerMovies(3);
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        manager.add(" Джентельмены ");
        manager.add(" Человек-невидимка ");
        manager.add(" Тролли. Мировой тур ");
        manager.add(" Номер один ");
        String[] actual = manager.findLast();
        String[] expected = {" Номер один ", " Тролли. Мировой тур ", " Человек-невидимка "};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitOneTest() {
        ManagerMovies manager = new ManagerMovies(1);
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        manager.add(" Джентельмены ");
        manager.add(" Человек-невидимка ");
        manager.add(" Тролли. Мировой тур ");
        manager.add(" Номер один ");
        String[] actual = manager.findLast();
        String[] expected = {" Номер один "};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitSevenTest() {
        ManagerMovies manager = new ManagerMovies(7);
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        manager.add(" Джентельмены ");
        manager.add(" Человек-невидимка ");
        manager.add(" Тролли. Мировой тур ");
        manager.add(" Номер один ");
        String[] actual = manager.findLast();
        String[] expected = {" Номер один ", " Тролли. Мировой тур ", " Человек-невидимка ", " Джентельмены ", " Отель Белград ", " Вперёд ", " Блатшот "};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void resultLengthTest() {
        ManagerMovies manager = new ManagerMovies(7);
        manager.add(" Блатшот ");
        manager.add(" Вперёд ");
        manager.add(" Отель Белград ");
        manager.add(" Джентельмены ");
        manager.add(" Человек-невидимка ");
        manager.add(" Тролли. Мировой тур ");
        manager.add(" Номер один ");
        String[] expected = {" Номер один ", " Тролли. Мировой тур ", " Человек-невидимка ", " Джентельмены ", " Отель Белград ", " Вперёд ", " Блатшот "};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
