public class Book {
    private String nameBook;
    private int yearPublication;
    private Author Authore;

    public Book(String nameBook, int yearPublication) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;

    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
