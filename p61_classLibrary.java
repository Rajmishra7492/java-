class library {
    String[] books;
    int no_of_books;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "has been added!");
    }

    void availablebook() {
        System.out.println("available books are");
        for (String book : this.books) {
            if (book == null) {
                break;
            }
            System.out.println("*" + book);
        }
    }
}

public class p61_classLibrary {

    public static void main(String[] args) {
        library centralLibrary = new library();
        centralLibrary.addBook("think and grow rich");
        centralLibrary.availablebook();
    }
}
