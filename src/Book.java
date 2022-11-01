public class Book {
    private String nameBook;
    private int yearPublication;
    private final Author author;


    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
