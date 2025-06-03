class Book {
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private double price;

    public Book(String title, String author, String genre, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (Genre: " + genre + ", ISBN: " + isbn + ", Price: $" + String.format("%.2f", price) + ")";
    }
}

class Bookshelf {
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    public Bookshelf(Book book1, Book book2, Book book3, Book book4) {
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
        this.book4 = book4;
    }

    public Book getBook1() {
        return book1;
    }

    public Book getBook2() {
        return book2;
    }

    public Book getBook3() {
        return book3;
    }

    public Book getBook4() {
        return book4;
    }

    public void displayBooks() {
        System.out.println("Books on the shelf:");
        System.out.println("1. " + book1);
        System.out.println("2. " + book2);
        System.out.println("3. " + book3);
        System.out.println("4. " + book4);
    }
}

public class Library {
    public static void main(String[] args) {
        // Create four different books
        Book book1 = new Book("1984", "George Orwell", "Dystopian Fiction", "978-0451524935", 9.99);
        Book book2 = new Book("A Brief History of Time", "Stephen Hawking", "Science Non-Fiction", "978-0553380163", 18.95);
        Book book3 = new Book("The Hoobit", "J.R.R Tolkien", "Fantasy", "978-8595084742", 24.97);
        Book book4 = new Book("The Hitchhiker's Guide to the Galaxy", "Adam Douglas", "Science Fiction", "978-0575074842", 42.42);
        // Create a bookshelf with the four books
        Bookshelf bookshelf = new Bookshelf(book1, book2, book3, book4);

        // Display the books on the bookshelf
        bookshelf.displayBooks();
    }
}
