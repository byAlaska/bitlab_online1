package bitlab.askar.Module2.Lesson6;

public class MyThread2 extends  Thread{
    public void run(){
        try {

            for (int i=0;i<5;i++){
                System.out.println("My friend: ");
                Thread.sleep(500);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
