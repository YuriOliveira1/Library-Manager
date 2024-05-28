package Classes;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private User user;
    private LocalDate dateOfLoan;
    private LocalDate dateOfDevolution;

    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.dateOfLoan = LocalDate.now();
        this.dateOfDevolution = null;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfLoan() {
        return dateOfLoan;
    }

    public LocalDate getDateOfDevolution() {
        return dateOfDevolution;
    }

    public void devolution(){
        dateOfDevolution = LocalDate.now();
        book.setBookStatus(true);
    }

    @Override
    public String toString() {
        return "Loan [book=" + book + ", user=" + user + ", dateOfLoan=" + dateOfLoan + ", dateOfDevolution="
                + dateOfDevolution + "]";
    }
}
