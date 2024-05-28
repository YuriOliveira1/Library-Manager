package Classes;

public class Book {
    private String nameOfBook;
    private String nameOfAutor;
    private String idOfBook;
    private boolean bookStatus;

    public Book(String nameOfBook, String nameOfAutor, String idOfBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAutor = nameOfAutor;
        this.idOfBook = idOfBook;
        this.bookStatus = true;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getNameOfAutor() {
        return nameOfAutor;
    }

    public String getIdOfBook() {
        return idOfBook;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }
}
