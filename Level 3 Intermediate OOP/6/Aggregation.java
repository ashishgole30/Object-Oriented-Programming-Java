public class Aggregation {
    public static void main(String[] args) {
        // Aggregation

        /*
         * Definition
         * Aggregation is a HAS-A relationship where one class contains another class,
         * but the contained object can exist independently.The child object can exist
         * without the parent object.
         * Example
         * Student HAS-A Address
         * Department HAS-A Teacher
         * Library HAS-A Books
         * If the Department is deleted, the Teacher can still exist.
         * 
         * Concept (Simple Understanding)
         * In Aggregation:
         * One class uses another class object
         * The object is created outside the class
         * The parent class does not control its lifetime
         * 
         * | Feature | Composition | Aggregation |
         * | ------------------------- | ------------------- | -------------------- |
         * | Object creation | Inside parent class | Outside parent class |
         * | Relationship strength | Strong | Weak |
         * | Child object independent? | No | Yes |
         * 
         * Department
         * |
         * ---> Teacher
         * Teacher can exist even if department object is deleted.
         * 
         */

        Book book1 = new Book("Java Bascis", "James");
        Library library1 = new Library("City Library", book1);

        library1.showLibrary();
        book1.showBook();
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    String libraryName;
    Book book1;

    Library(String libraryName, Book book1) {
        this.libraryName = libraryName;
        this.book1 = book1;
    }

    void showLibrary() {
        System.out.println("Library Name: " + libraryName);
    }
}