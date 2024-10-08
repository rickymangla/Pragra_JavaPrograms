public class Book {

    String title;
    String author;
    int yearPublished;
    double price;
    String genre;

    Book() {
        title="five points someone";
        author="chetan bhagat";
        yearPublished=2001;
        price=25.50;
        genre="fiction";
    }

    Book(String title, String author, int yearPublished, double price, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.genre = genre;
    }

    public void bookDetails() {
        System.out.println("title is: " + title + "\n" + "author is: " + author + "\n" + "year Published is: " + "\n" +
                yearPublished + "\n" + "price is: " + price + "\n" + "genre is: " + genre);
    }

}
