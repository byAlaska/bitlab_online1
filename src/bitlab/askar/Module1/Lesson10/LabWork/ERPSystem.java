package bitlab.askar.Module1.Lesson10.LabWork;

public class ERPSystem {
    User []users = new User[100];
    int sizeOfUsers = 0;


    public ERPSystem() {
    }

    public ERPSystem(User[] users) {
        this.users = users;
    }

    public void addUser(User user){

        if (sizeOfUsers>99){
            return;
        }

        users[sizeOfUsers] = user;
        sizeOfUsers++;
    }

    public void printAllUsers(){
        for (int i=0;i<users.length;i++){
            System.out.println(users[i].getUserData());
        }
    }

    public void printUser(int index){

        if (index<sizeOfUsers){
            System.out.println(users[index].getUserData());
        }

    }


}
