package bitlab.askar.Module1.Lesson10.LabWork;

import java.util.Arrays;

public class Teacher extends User {

    private String nickName;
    private String status;
    private String subjects[] = new String[10];
    private int sizeOfSubjects = 0;

    public Teacher() {
    }

    public Teacher(String login, String password, String nickName, String status) {
        super(login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public void addSubject(String subject){

        if (sizeOfSubjects>9){
            return;
        }

        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }




    @Override
    String getUserData() {
        return "Teacher{" +
                "nickName='" + nickName + '\'' +
                ", status='" + status + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                ", sizeOfSubjects=" + sizeOfSubjects +
                ", id=" + id +
                ", login='" + login + '\'' +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }
}
