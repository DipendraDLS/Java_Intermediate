package WaitAndNotify;

public class WaitAndNotifyDemo
{
    public static class Account
    {
        private int balance = 0;
        public synchronized void deposit(int amount) {
            System.out.println("Depositing " + amount);
            balance += amount;
            System.out.println("Deposit complete");
            notify();
        }
        public synchronized void withdraw(int amount) throws InterruptedException {
            System.out.println("Withdrawing " + amount);
            while(balance < amount) {
                System.out.println("waiting...");
                wait();  //Until the notify() doesn't execute it keeps waiting and doesn't execute other lines of statements.
            }
            balance -= amount;
            System.out.println("Withdraw complete");
        }

    }

        public static void main(String[] args)
        {
        Account account = new Account();
        Thread t1 = new Thread(() -> {
            try {
                account.withdraw(1_000);
            }
            catch(InterruptedException e) { }
        });
        Thread t2 = new Thread(() -> {
            account.deposit(500);
            try {
                Thread.sleep(1_000);
            }
            catch(InterruptedException e) { }
            account.deposit(500);
        });
        t1.start(); t2.start();
    }
}
