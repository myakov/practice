package Multithreading;

public class TxWorker implements Runnable {

    protected BankAccount account;
    protected char txType; // w -> withdraw , d -> deposit
    protected int amt;

    public TxWorker(BankAccount account, char txType, int amt) {
        this.account = account;
        this.txType = txType;
        this.amt = amt;
    }

    public void run() {
        if (txType == 'w') {
            account.withdraw((amt));
        } else if (txType == 'd') {
            account.deposit(amt);
        }
    }
}
