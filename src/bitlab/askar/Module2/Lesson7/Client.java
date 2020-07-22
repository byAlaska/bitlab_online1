package bitlab.askar.Module2.Lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        try {

            Socket socket = new Socket("localhost",2077);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());


            while (true){
                String message = in.nextLine();

                PackageData pd = new PackageData(name, message);
                outputStream.writeObject(pd);
                pd = (PackageData)inputStream.readObject();
                System.out.println(pd.getMessage());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
