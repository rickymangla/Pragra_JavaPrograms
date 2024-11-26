public class Book {

    String title;
    String author;

    Book() {
        title = "unknown";
        author = "unknown";
//        System.out.println("title is: " + title + "\n" + "author is: " + author);
    }

    Book(String title) {
        this();
        this.title = title;
        author = "unknown";
//        System.out.println("title is: " + title + "\n" + "author is: " + author);
    }

    Book(String title, String author) {
        this("harry potter");
        this.title = title;
        this.author = author;
//        System.out.println("title is: " + title + "\n" + "author is: " + author);
    }

    public void bookDetails() {
        System.out.println("title is: " + title + "\n" + "author is: " + author);
    }

}
