package Lesson16;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Reader> readers = new ArrayList<>();
    String[] names = {"Иван", "Пётр", "Григорий", "Виктор", "Олег"};

    public static void main(String[] args) {
        Library library = new Library();
        library.start();
    }
    public void start(){
        getBooks();
        getReaders(5);
        for (int i = 0; i < 10; i++) {
            if(books.size() > 0) getRandomReader().getBook(getRandomBook());
            else System.out.println("Книги кончились!");
        }
        System.out.println("\n-------------------------------------------------------------\n");
        for (int i = 0; i < 10; i++) {
            Reader reader = getRandomReader();
            if(reader.myBooks.size() > 0){
                reader.returnBook(reader.getRandomBook());
            }
            else{
                System.out.println("У читателя по имени " + reader.name + " нет книг!");
            }
        }
    }
    void getBooks(){
        books.add(new Book("Жюль Верн", "Таинственный остров"));
        books.add(new Book("Рэй Брэдбери", "451 градус по Фаренгейту"));
        books.add(new Book("Чхугон", "Поднятие уровня в одиночку"));
        books.add(new Book("Михаил Шолохов", "Тихий Дон"));
        books.add(new Book("Лев Толстой", "Война и мир"));
        books.add(new Book("Федор Достоевский", "Преступление и наказание"));
    }
    void getReaders(int count){
        for(int i = 0; i < count; i++){
            Reader reader = new Reader(this, getRandomName());
            readers.add(reader);
        }
    }
    String getRandomName(){
        return names[(int)(Math.random() * names.length)];
    }
    Book getRandomBook(){
        return books.get((int)(Math.random() * books.size()));
    }
    Reader getRandomReader(){
        return readers.get((int)(Math.random() * readers.size()));
    }
}
