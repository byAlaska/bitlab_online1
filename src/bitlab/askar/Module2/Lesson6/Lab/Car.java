package bitlab.askar.Module2.Lesson6.Lab;

public class Car extends Thread {

    private String carName;
    private int speed;
    private double distance;


    public Car(ThreadGroup group, String name, String carName, int speed, double distance) {
        super(group, name);
        this.carName = carName;
        this.speed = speed;
        this.distance = distance;
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void run() {

        try {

            int currentDistance = 0;
            for (int i=0;i<distance/100;i++){
                currentDistance += 100;
                System.out.println(carName + ": is on " + currentDistance);
                Thread.sleep(((long)distance/speed) * 100);
            }

            System.out.println("FINISHED: " + carName);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
