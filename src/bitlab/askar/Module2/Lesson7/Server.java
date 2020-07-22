package bitlab.askar.Module2.Lesson7;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){

        try{

            ServerSocket server = new ServerSocket(2077);
            System.out.println("Server Started!");

            while (true) {
                Socket socket = server.accept();
                ServerThread serverThread = new ServerThread(socket);
                serverThread.start();
                System.out.println("Client connected");
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
