package Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class AccountGroup implements Serializable {

    private Map<String, BankAccount> accountMap = new HashMap<>();
    private transient int totalBalance;

    public int getTotalBalance() {
        return totalBalance;
    }

    public void addAccount(BankAccount account) {
        totalBalance += account.getBalance();
        accountMap.put(account.getId(), account);
    }

    public static void saveGroup(AccountGroup g, String fileName) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            objectOutputStream.writeObject(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AccountGroup loadGroup(String fileName) {
        AccountGroup g = null;
        try (ObjectInputStream objectInputStream =
                     new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            g = (AccountGroup) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return g;

    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("1234", 600);
        BankAccount account2 = new BankAccount("5678", 9000);
        AccountGroup group = new AccountGroup();

        group.addAccount(account1);
        group.addAccount(account2);

        //serialization
        saveGroup(group, "group.dat");

        //de-serialization. Transient filed are not serialized at all
        AccountGroup accountGroup = loadGroup("group.dat");
        System.out.println(accountGroup.getTotalBalance());

    }

}

