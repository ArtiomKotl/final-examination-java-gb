package library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibraryEntity book1 = new Book(1, "Гарри Поттер Философский камень", "Джоан Роулинг");
        LibraryEntity book2 = new Book(2, "Порри Гаттер и Каменный Философ", "Андрей Жвалевский");
        LibraryEntity book3 = new Book(3, "Дураки и дороги", "Андрей Жвалевский");

        LibraryEntity newspaper1 = new Newspaper(4, "Известия");
        LibraryEntity newspaper2 = new Newspaper(5, "АиФ");
        LibraryEntity newspaper3 = new Newspaper(6, "КМ");

        LibraryEntity microFilm1 = new MicroFilm(7, "Хогвартс", "Джоан Роулинг");
        LibraryEntity microFilm2 = new MicroFilm(8, "Дороги", "Андрей Жвалевский");
        LibraryEntity microFilm3 = new MicroFilm(9, "Спорт", "Виктор Гусев");


        Library library1 = new LibraryMunicipal("Библиотека1", new ArrayList<>());
        library1.addEntity(book1).addEntity(newspaper2).addEntity(microFilm3)
                .addEntity(book3).addEntity(newspaper3).addEntity(microFilm1)
                .addEntity(book2).addEntity(newspaper1).addEntity(microFilm2);

        Search search = new Search();
        List<LibraryEntity> searchList = search.filterList(library1,2);
        System.out.println(searchList);

        List<LibraryEntity> searchList1 = search.filterList(library1,"Роулинг");
        System.out.println(searchList1);
    }

}