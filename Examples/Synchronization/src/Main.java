import java.math.BigInteger;
/*
class Account {
    private BigInteger credit;

    public Account() {
        credit = BigInteger.ZERO;       // 0 to credit
    }

    public void deposit(BigInteger amount) {
        credit = credit.add(amount);
    }

    public boolean withdraw(BigInteger amount) {
        BigInteger result = credit.subtract(amount);

        if (result.signum() == -1) {    // test whether the result is negative
            return false;
        } else {
            credit = result;
            return true;
        }
    }

    public BigInteger getSaldo() {
        return credit;
    }
}

 */

class Account {
    private BigInteger credit;

    public Account() {
        credit = BigInteger.ZERO;       // 0 to credit
    }

    public synchronized void deposit(BigInteger amount) {
        credit = credit.add(amount);
    }

    public synchronized boolean withdraw(BigInteger amount) {
        BigInteger result = credit.subtract(amount);

        if (result.signum() == -1) {    // test whether the result is negative
            return false;
        } else {
            credit = result;
            return true;
        }
    }

    public BigInteger getSaldo() {
        return credit;
    }
}

// Depositor is our worker here
class Depositor implements Runnable {
    private Account account;
    private int     n;

    public Depositor(Account account, int n) {
        this.account = account;
        this.n       = n;
    }

    public void run() {
        for (int i = 0; i < n; i++)
            account.deposit(BigInteger.ONE);    // we deposit 1 (unit of money)
    }
}

public class Main {
    static final int N = 1000;
    static final int M = 10;

    public static void main(String[] args) {
        for (int i = 0; i < M; i++) {
            Account account = new Account();

            Thread william = new Thread(new Depositor(account, N));
            Thread jeff = new Thread(new Depositor(account, N));

            // depositors start their work
            william.start(); jeff.start();

            // here we wait for them to be ready
            try {
                william.join(); jeff.join();
            } catch (InterruptedException e) {
            }

            System.out.println("Account balance is: " + account.getSaldo());
        }
    }
}