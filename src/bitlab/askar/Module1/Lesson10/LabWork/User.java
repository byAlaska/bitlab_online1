package bitlab.askar.Module1.Lesson10.LabWork;

public abstract class User {

    protected int id;
    protected String login;
    protected String password;
    protected int currentId = 0;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.id = currentId++;
    }

    abstract String getUserData();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}