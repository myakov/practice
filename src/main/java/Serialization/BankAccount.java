package Serialization;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BankAccount implements Serializable {

    private final String id;
    private int balance = 0;
    private char lastTxType;
    private int lastTxAmount;
    private static final long serialVersionUID = 1360826667806852920L;


    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        lastTxType = 'd';
        lastTxAmount = amount;
    }

    public synchronized void withdraw(int amout) {
        balance -= amout;
        lastTxType = 'w';
        lastTxAmount = amout;
    }

    public BankAccount(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public BankAccount(String id) {
        this.id = id;
    }

    private static void saveAccount(BankAccount ba, String fileName) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            objectOutputStream.writeObject(ba);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BankAccount loadAccount(String fileName) {
        BankAccount acc = null;
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            acc = (BankAccount) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return acc;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("1234", 500);
        BankAccount bankAccount2 = new BankAccount("5678", 100);

        bankAccount.deposit(250);
        bankAccount2.withdraw(99);

        //serialize account
        saveAccount(bankAccount, "account.dat");
        saveAccount(bankAccount2, "account2.dat");


        //de-serialize account
        BankAccount acct = loadAccount("account.dat");
        BankAccount acct2 = loadAccount("account2.dat");


        System.out.println("ID: " + acct.getId() + " : " + "Balance: " + acct.getBalance() + " Last transaction type: " + acct.lastTxType +
                " Last transaction amount: " + acct.lastTxAmount);
        System.out.println("ID: " + acct2.getId() + " : " + "Balance: " + acct2.getBalance() + " Last transaction type: " + acct2.lastTxType +
                " Last transaction amount: " + acct2.lastTxAmount);

        //calculate UID
//        Integer i = new Integer(10);
//        long serialVersionID = ObjectStreamClass.lookup(i.getClass()).getSerialVersionUID();
//        System.out.println(serialVersionID);


    }
}
