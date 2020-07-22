package bitlab.askar.Module2.Lesson6;

import bitlab.askar.Module2.Lesson6.Lab.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("t1");
        Car car1 = new Car(threadGroup, "t1","BMW",100,1000);
        Car car2 = new Car(threadGroup, "t2","Ferrari",400,1000);
        Car car3 = new Car(threadGroup, "t3","Bugatti",150,1000);
        Car car4 = new Car(threadGroup, "t4","Mercedes",300,1000);
        Car car5 = new Car(threadGroup, "t5","Jeep",200,1000);


        ArrayList<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Car c:cars){
            c.start();
        }


        ArrayList<Car> cars1 = new ArrayList<>();


        int cnt = threadGroup.activeCount();
        while (true){
            if (threadGroup.activeCount()<cnt){

                cnt--;
                System.out.println(threadGroup.activeCount());

                for (Car c:cars){
                    if (!c.isAlive()){
                        cars1.add(c);
                        cars.remove(c);
                        break;
                    }
                }
            }
            if (threadGroup.activeCount()==0) break;
        }

        for (Car c:cars1){
            System.out.println(c.getCarName());
        }


    }
}
