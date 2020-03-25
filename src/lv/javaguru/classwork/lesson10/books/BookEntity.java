package lv.javaguru.classwork.lesson10.books;

public class BookEntity {

    private long id;
    private String author;
    private String title;

    public BookEntity(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }

}
