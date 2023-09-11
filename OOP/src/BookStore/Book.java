package BookStore;

public class Book {
    private int id;
    private String bookTitle;
    private double price;


    public Book(int id, String bookTitle, double price) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void showInfor(){
        System.out.println("ID\t\t:"+this.getId());
        System.out.println("Book's Name: "+this.getBookTitle());
        System.out.println("Price of book: "+this.getPrice());

    }
}
