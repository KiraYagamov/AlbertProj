package Lesson16;

import java.util.ArrayList;

public class Reader {
    ArrayList<Book> myBooks = new ArrayList<>();
    String name;
    Library library;
    public Reader(Library l, String n){
        name = n;
        library = l;
    }
    public void getBook(Book book){
        myBooks.add(book);
        library.books.remove(book);
        System.out.println(name + " взял книгу " + book.title + ", автора: " + book.author);
    }
    public void returnBook(Book book){
        library.books.add(book);
        myBooks.remove(book);
        System.out.println(name + " вернул книгу " + book.title + ", автора: " + book.author);
    }
    public Book getRandomBook(){
        return myBooks.get((int)(Math.random() * myBooks.size()));
    }
}
