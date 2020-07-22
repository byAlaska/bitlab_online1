package bitlab.askar.Module2.Lesson2.Lab;

public class Connection {

    public User[] getUsers(){

        User[] users = {
                new User("qwe","qwe","123","asdf123"),
                new User("asd","asdf","hello","there"),
                new User(),
                new User(),
        };
        return users;
    }
}
