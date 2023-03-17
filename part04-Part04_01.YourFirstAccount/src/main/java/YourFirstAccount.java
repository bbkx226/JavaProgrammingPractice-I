
public class YourFirstAccount {

    public static void main(String[] args) {
        Account brandonAccount = new Account("Brandon's account in Malaysia", 100.00); 
        brandonAccount.deposit(20);
        System.out.println(brandonAccount);
    }
}
