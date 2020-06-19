
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        
        Account newAcc = new Account("Matthews account", 1000);
        Account newAcct = new Account("My account", 0);
        newAcc.withdrawal(100);
        newAcct.deposit(100);
        
        System.out.println(newAcc);
        System.out.println(newAcct);
    }
}
