package bitlab.askar.Module1.Project;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Input account number");
        String accountNumber = in.next();
        System.out.println("Input pin code");
        String pinCode = in.next();

        BankAccount[] accounts = Database.allAccounts;
        BankAccount account = null;

        int a = 10;
        int b  = a;
        a = 20;


        for (int i = 0; i < 3; i++) {
            if (accounts[i].getPinCode().equals(pinCode) && accounts[i].getAccountNumber().equals(accountNumber)) {
                account = accounts[i];
                break;
            }
        }

        if (account instanceof CityBankAccount) {

            while (true) {

                System.out.println("   PRESS [1] TO CASH WITHDRAWAL  // снять деньги\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                        "\n" +
                        "               PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                        "\n" +
                        "               PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                        "\n" +
                        "               PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                        "\n" +
                        "               PRESS [6] TO EXIT // выход\n" +
                        "\n");

                int choice1 = in.nextInt();

                if (choice1 == 1) {
                    System.out.println("How much?");
                    int credit = in.nextInt();
                    account.creditBalance(credit);
                } else if (choice1 == 2)
                    System.out.println(account.totalBalance());
                else if (choice1 == 3) {
                    System.out.println("New pin code:");
                    String newPinCode = in.next();
                    account.setPinCode(newPinCode);
                    System.out.println("Success");
                } else if (choice1 == 4) {
                    System.out.println("Input money");
                    int debet = in.nextInt();
                    account.debetBalance(debet);
                    System.out.println("Success");
                } else if
                (choice1 == 5) System.out.println(account.accountData());
                else break;
            }

        } else {
            while (true) {


                System.out.println("               PRESS [1] TO CASH WITHDRAWAL\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE\n" +
                        "\n" +
                        "               PRESS [3] TO EXIT");


                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("How much?");
                    int credit = in.nextInt();
                    account.creditBalance(credit);
                } else if (choice == 2) {
                    System.out.println(account.totalBalance());
                } else break;
            }
        }
    }
}
