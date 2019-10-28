package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankService {

    public static void main(String[] args) {

        BankAccount st = new BankAccount(100);
        ExecutorService es = Executors.newFixedThreadPool(5);
        TxPromoWorker workers = new TxPromoWorker(st, 'd', 10);


        es.submit(workers);
    }
}
