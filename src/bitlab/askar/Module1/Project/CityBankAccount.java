package bitlab.askar.Module1.Project;

public class CityBankAccount implements BankAccount, Comparable {

    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;
    public static int accountsCount = 0;

    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    {
        accountsCount++;
    }

    static {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {

        if (credit > this.balance){
            System.out.println("No such money");
        }else{
            this.balance -= credit;
            System.out.println("Success");
        }
    }

    @Override
    public void debetBalance(int debet) {
        this.balance += debet;
    }

    @Override
    public String accountData() {
        return "CityBankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        CityBankAccount account = (CityBankAccount)o;

        if (this.balance == account.balance && this.pinCode == account.pinCode){
            return 1;
        }else{
            return -1;
        }
    }
}