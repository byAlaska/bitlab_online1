package bitlab.askar.Module1.Lesson11;

public class Multivarka implements Rozetka, CanCook {

    @Override
    public void connect() {
        System.out.println("Multivarka connected");

    }

    @Override
    public void cook() {

        System.out.println("Multivarka is cooking");
    }
}
