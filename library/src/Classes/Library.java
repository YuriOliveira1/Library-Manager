package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Exceptions.*;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private Map<Book, Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new HashMap<>();
    }

    // Adiciona no ArrayList o Objeto Book
    public void addBook(Book book) {
        books.add(book);
    }

    // Adiciona no ArrayList o Objeto User
    public void addUser(User user) {
        users.add(user);
    }

    // Temos o metodo toLoan que recebe dois parametro Book book e User user.
    // Esse metodo primeiro verifica se o Status do Livro é False, se for, iria
    // lançar uma Exception do Tipo BookAvailableException
    // Instaciamos um Objeto Loan, com os parametro que colocamos no metodo.
    // Colocas no HashMap a key Book e o Value loan, colocamos num HashMap para
    // dizer que estamos "Emprestando"
    // Setamos o Status como False, já que estamos emprestando um Livro.
    // Após isso envio uma notificação ao Usuario.
    public void toLoan(Book book, User user) throws BookAvailableException {
        if (!book.isBookStatus()) {
            throw new BookAvailableException("The book mis already on loan.");
        }

        Loan loan = new Loan(book, user);
        loans.put(book, loan);
        book.setBookStatus(false);

        sendNotification(user, "The book" + book.getNameOfBook() + " was returned successfully");
    }

    // Temos o metodo returnBook que recebe Book book como parametro.
    // Loan loan recebe o a key e o valor da Hashmap que ele coloca em book.
    // se loan for nulo, ou seja, nao existe na HashMap, retorna uma Exception.
    // Pega o Metodo Devolution que seta o Status como True e remove da HashMap.
    // Após isso retorna uma notificação ao Usuario.
    public void returnBook(Book book) throws BookUnavailableException {
        Loan loan = loans.get(book);
        if (loan == null) {
            throw new BookUnavailableException("The book is not on loan.");
        }

        loan.devolution();
        loans.remove(book);
        sendNotification(loan.getUser(), "The book " + book.getNameOfBook() + " was returned successfully");
    }

    private void sendNotification(User user, String msg) {
        System.out.println("Notification for " + user.getNameOfUser() + ": " + msg);
    }

    public int searchIdBook(String idBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIdOfBook().equals(idBook)) {
                return i;
            }
        }
        return -1;
    }

    public int searchNameOfBook(String nameBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getNameOfBook().equals(nameBook)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public Map<Book, Loan> getLoans() {
        return loans;
    }
}
