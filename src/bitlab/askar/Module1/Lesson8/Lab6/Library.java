package bitlab.askar.Module1.Lesson8.Lab6;

public class Library {

    private String name;
    private String city;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;


    public Library() {
    }

    public Library(String name, String city, Book[] books) {
        this.name = name;
        this.city = city;
        for (int i=0;i<books.length;i++){
            this.books[i] = books[i];
        }
        this.sizeOfBooks = books.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int size(){
        return sizeOfBooks;
    }

    public void addBook(Book book){
        books[sizeOfBooks] = book;
        sizeOfBooks++;
    }

    public Book getBook(int index){
        return books[index-1];
    }

    public int priceSum(){

        int sum  = 0;
        for (int i=0;i<sizeOfBooks;i++){
            sum += books[i].getPrice();
        }

        return sum;
    }



}
