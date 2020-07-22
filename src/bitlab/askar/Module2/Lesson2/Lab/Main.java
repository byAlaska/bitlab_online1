package bitlab.askar.Module2.Lesson2.Lab;

public class Main {
    public static void main(String[] args){

        Connection connection = DatabaseDriverUtil.getConnection("https://bitlab.kz:3306/",  "mainda", "root",  "bitlab2017");

        if (connection!=null){
             User[] users = connection.getUsers();

             for (int i=0;i<users.length;i++){
                 System.out.println(users[i].toString());
             }
        }else {
            System.out.println("error not connected");
        }

    }
}
