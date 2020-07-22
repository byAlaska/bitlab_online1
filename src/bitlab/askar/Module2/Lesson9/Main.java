package bitlab.askar.Module2.Lesson9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        DBManager dbManager = new DBManager();
        dbManager.connect();


        dbManager.deleteCar(4L);

        ArrayList<Car> cars = dbManager.getAllCars();

        for (Car c:cars){
            System.out.println(c.toString());
        }
    }
}
