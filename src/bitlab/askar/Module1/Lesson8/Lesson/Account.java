package bitlab.askar.Module1.Lesson8.Lesson;

public class Account {
    private String login;
    private String password;
    static int count = 0;


    public Account(String login, String password) {
        this.login = login;
        this.password = password;
        count++;
    }

    public void setPassword(String password, String oldPassword) {
        if (oldPassword.equals(this.password)){
            if (password.length() > 8){
                if (password.charAt(0) == 'A'){
                    this.password = password;
                }
            }
        }
        this.password = password;

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

}
