class Book {
    private int bookId;
    private String title, author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
}

abstract class LibraryMember {
    int memberId;
    String name;

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(Book book);
}

interface Notifyable {
    void sendNotification(String message);
}

class StudentMember extends LibraryMember implements Notifyable {
    int booksBorrowed = 0;
    final int LIMIT = 3;

    StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    void borrowBook(Book book) {
        if (booksBorrowed < LIMIT) {
            booksBorrowed++;
            System.out.println("StudentMember " + name + " borrowed " + booksBorrowed + " books");
        }
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

class FacultyMember extends LibraryMember implements Notifyable {
    int booksBorrowed = 0;
    final int LIMIT = 5;

    FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    void borrowBook(Book book) {
        if (booksBorrowed < LIMIT) {
            booksBorrowed++;
            System.out.println("FacultyMember " + name + " borrowed " + booksBorrowed + " books");
        }
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java Programming", "James Gosling");
        Book b2 = new Book(2, "OOP Concepts", "Grady Booch");

        StudentMember s = new StudentMember(101, "Amit");
        FacultyMember f = new FacultyMember(201, "Prof. Singh");

        s.borrowBook(b1);
        s.borrowBook(b2);

        f.borrowBook(b1);
        f.borrowBook(b2);

        s.sendNotification("Return books within 7 days");
        f.sendNotification("Return books within 14 days");
    }
}
