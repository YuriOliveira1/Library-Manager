package Program;

import java.util.Scanner;

import Classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int optionMain = 1;

        System.out.println("Welcome to the System Lonf Library Manager");
        System.out.println("----------------------------------------------");

        while (optionMain != 4) {
            optionMain = menuLibrary(sc);

            sc.nextLine();

            if (optionMain == 1) {
                System.out.print("Name of Book: ");
                String nameOfBook = sc.nextLine();
                System.out.print("Name Of Autor: ");
                String nameOfAutor = sc.nextLine();
                System.out.print("Id Of Book: ");
                String idOfBook = sc.nextLine();

                Book book = new Book(nameOfBook, nameOfAutor, idOfBook);
                library.addBook(book);

            } else if (optionMain == 2) {
                System.out.print("Name of User: ");
                String nameOfUser = sc.nextLine();
                System.out.print("Email of User: ");
                String emailOfEmail = sc.nextLine();
                System.out.print("Number Of User: ");
                String numberOfUser = sc.nextLine();

                User user = new User(nameOfUser, emailOfEmail, numberOfUser);
                library.addUser(user);

                System.out.println("Which Id Book do you want to choose?");
                String idOfBook = sc.nextLine();
                int indexOfBook = library.searchIdBook(idOfBook);
                if (indexOfBook == -1) {
                    throw new IllegalArgumentException("Not Found");
                }

                Book bookLoan = library.getBooks().get(indexOfBook);

                try {
                    library.toLoan(bookLoan, user);
                } catch (Exception e) {
                    System.out.println("Error 404");
                }

            } else if (optionMain == 3) {
                System.out.print("Which book will you return? ");
                String book = sc.nextLine();

                int indexOfNameBook = library.searchNameOfBook(book);

                Book bookToReturn = library.getBooks().get(indexOfNameBook);
                library.returnBook(bookToReturn);
            } else if (optionMain == 4) {
                System.out.println("Exiting...");
            }
        }
        sc.close();
    }

    public static int menuLibrary(Scanner scanner) {
        boolean optionLoop = false;
        int option = 4;

        while (!optionLoop) {
            System.out.println("1 - Add Books");
            System.out.println("2 - Borrow Books");
            System.out.println("3 - Return Book");
            System.out.println("4 - Exit");

            try {
                option = scanner.nextInt();
                if (option >= 1 && option <= 4) {
                    optionLoop = true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Entry");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error 404");
                scanner.nextLine();
            }
        }
        return option;
    }
}
