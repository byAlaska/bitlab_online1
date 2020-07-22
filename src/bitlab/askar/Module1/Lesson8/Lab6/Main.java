package bitlab.askar.Module1.Lesson8.Lab6;

public class Main {
    public static void main(String[] args){
        Book[] books  = {
                new Book("qweryty", "asdasd",198593,1000),
                new Book("Harry Potter", "j",25125,2000),
                new Book("asd", "qwe",900909,10000),
                new Book("Askar", "Askarov",111,2000),
                new Book("hoppipolla", "Sigur ros",678,100000)
        };

        Library library = new Library("Abay", "Almaty", books);

        System.out.println(library.priceSum());

        System.out.println(library.getBook(2).toString());

        library.addBook(new Book("Macbook", "Apple",20000,124124));

        System.out.println(library.getBook(6).toString());

        System.out.println(library.size());
    }
}
