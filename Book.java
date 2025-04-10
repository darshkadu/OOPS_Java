class Book {
    private static int count = 0;
    private int id;
    private String title;

    public Book(String title) {
        this.title = title;
        this.id = ++count;
    }

    public void printInfo() {
        System.out.println("Book #" + id + ": " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java 101");
        Book b2 = new Book("Data Structures");
        b1.printInfo();
        b2.printInfo();
    }
}
