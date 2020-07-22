package bitlab.askar.Module2.Lesson6;

public class MyThread extends Thread {

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run(){
        try {

            for (int i=0;i<5;i++){
                System.out.println("Hello: " + i  + getName());
                Thread.sleep(500);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
