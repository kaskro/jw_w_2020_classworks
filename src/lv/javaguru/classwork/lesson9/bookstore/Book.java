package lv.javaguru.classwork.lesson9.bookstore;

public class Book implements Comparable<Book> {

    private String author;
    private String title;
    private Genre genre;

    public Book(Genre genre, String title, String author) {
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
