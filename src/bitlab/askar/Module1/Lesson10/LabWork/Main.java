package bitlab.askar.Module1.Lesson10.LabWork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        ERPSystem erpSystem = new ERPSystem();

        while (true){

            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");


            int choice1 = in.nextInt();


            if (choice1==1){

                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD TEACHER");

                int choice2 = in.nextInt();

                if (choice2==1){
                    System.out.println("Login:");
                    String login = in.next();
                    System.out.println("Password:");
                    String password = in.next();
                    System.out.println("Name:");
                    String name = in.next();
                    System.out.println("Surname:");
                    String surname = in.next();
                    System.out.println("Group:");
                    String group = in.next();
                    System.out.println("GPA:");
                    double gpa = in.nextDouble();

                    Student student = new Student(login,password,name,surname,group,gpa);
                    erpSystem.addUser(student);
                }else{
                    System.out.println("Login:");
                    String login = in.next();
                    System.out.println("Password:");
                    String password = in.next();
                    System.out.println("NickName:");
                    String nickName = in.next();
                    System.out.println("Status:");
                    String status = in.next();

                    Teacher teacher = new Teacher(login,password,nickName,status);
                    while (true){
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO STOP ADDING SUBJECT");

                        int choice3 = in.nextInt();

                        if (choice3==1){

                            System.out.println(" Subject:");
                            String subject = in.next();
                            teacher.addSubject(subject);
                        }else{
                            break;
                        }
                    }
                    erpSystem.addUser(teacher);
                }



            }else if(choice1==2){

                System.out.println("PRESS [1] TO LIST STUDENTS\n" + "PRESS [2] TO LIST TEACHERS");
                System.out.println("PRESS [3] TO LIST USER BY INDEX");

                int choice2 = in.nextInt();

                if (choice2==1){

                    for (int i=0;i<erpSystem.users.length;i++){

                        if (erpSystem.users[i] instanceof Student){
                            System.out.println(erpSystem.users[i].getUserData());
                        }
                    }

                }else if (choice2==2){

                    for (int i=0;i<erpSystem.users.length;i++){

                        if (erpSystem.users[i] instanceof Teacher){
                            System.out.println(erpSystem.users[i].getUserData());
                        }
                    }
                }else{
                    System.out.println("INPUT INDEX");
                    int index = in.nextInt();
                    erpSystem.printUser(index);
                }


            }else{
                break;
            }

        }

    }
}
