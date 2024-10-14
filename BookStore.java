import java.util.Scanner;

class Book {
    // Class members
    private String name;
    private String author;
    private double price;
    private int numPages;

    // Constructor to initialize the values
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // Overriding the toString() method to display the complete details of the book
    @Override
    public String toString() {
        return "Book Name: " + name + ", Author: " + author + ", Price: $" + price + ", Pages: " + numPages;
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Creating an array to store n book objects
        Book[] books = new Book[n];

        // Taking input for each book
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter book name: ");
            String name = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter number of pages: ");
            int numPages = sc.nextInt();
            sc.nextLine(); // Consume the newline

            // Create the book object and store it in the array
            books[i] = new Book(name, author, price, numPages);
        }

        // Display the details of all books using toString() method
        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }

        sc.close();
    }
}
