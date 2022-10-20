import accounts.CheckingAccounts;
import accounts.CreditAccounts;
import accounts.SavingsAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {


        Client client = new Client("test", 3);
        client.addNewAccount(new SavingsAccount("savings_test", 1000, 1000));
        client.addNewAccount(new CreditAccounts("credit_test"));
        client.addNewAccount(new CheckingAccounts("checking_test"));
        client.addNewAccount(new SavingsAccount("savings_test2", 1000, 1000));
        client.pay(3000);


        SavingsAccount account1 = new SavingsAccount("test1", 5000, 10);
        CheckingAccounts account2 = new CheckingAccounts("test2");
        CreditAccounts account3 = new CreditAccounts("test3");

    }
}