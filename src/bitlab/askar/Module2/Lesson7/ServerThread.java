package bitlab.askar.Module2.Lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {


    Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());


            while (true){
                PackageData pd = (PackageData)inputStream.readObject();
                System.out.println(pd.getMessage());

                if (pd.getMessage().toLowerCase().contains("hello")){
                    pd.setMessage("Hello Askar");
                    outputStream.writeObject(pd);
                }else {
                    pd.setMessage("ok");
                    outputStream.writeObject(pd);
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
