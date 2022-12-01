package Activity5_1_Implementing_Stubs;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private List<String> author;
    private String publication;
    private Integer yearOfPublication;

    public Book(String isbn, String title, List<String> author, String publication, Integer yearOfPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.yearOfPublication = yearOfPublication;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
