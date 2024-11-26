public class BankManagementSystem {

        public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.deposit(100);
            account.withdraw(50);
            account.withdraw(100); // Insufficient funds
            System.out.println("Current balance: " + account.getBankAccount());
        }
}


