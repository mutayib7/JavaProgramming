class Book {
    String title, author;
    double price;

    Book() {
        title = "Default Book";
        author = "Unknown";
        price = 0.0;
    }

    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "ABC");
        Book b3 = new Book("Data Structures", "XYZ", 550.44);

        b1.display();
        b2.display();
        b3.display();
    }
}
