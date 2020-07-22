package bitlab.askar.Module1.Lesson11;


public class ElectroPlita implements Rozetka, CanCook {

    @Override
    public void connect() {

        System.out.println("ElectroPLita connected");
    }

    @Override
    public void cook() {
        System.out.println("ElectroPlita is cooking");
    }
}
