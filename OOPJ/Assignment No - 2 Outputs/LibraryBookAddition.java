 class Book {
        private int bookId;
        private String title;
        private String author;

        public Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "BookId=" + bookId + ", Title=" + title + ", Author=" + author;
        }
    }

    class Library {
        private String libraryName;
        private static int totalBooks = 0;

        public Library(String libraryName) {
            this.libraryName = libraryName;
        }

        public void addBook(Book b) {
            totalBooks++;
            System.out.println("Added: " + b);
        }

        public static void displayTotalBooks() {
            System.out.println("Total books in library: " + totalBooks);
        }
    }
class LibraryBookAddition {
    public static void main(String[] args) {
        Library lib = new Library("CDAC Library");
        Book b1 = new Book(1, "Java Programming", "Herbert Schildt");
        Book b2 = new Book(2, "Clean Code", "Robert Martin");

        lib.addBook(b1);
        lib.addBook(b2);
        Library.displayTotalBooks();
    }
}
