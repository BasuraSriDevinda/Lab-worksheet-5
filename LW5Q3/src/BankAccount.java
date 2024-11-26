public class BankAccount {
    private  int BankAccount;
    public void setBankAccount(int balance){
        this.BankAccount=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            BankAccount+=amount;
        }

    }
    public void withdraw(int amount){
        if(BankAccount>0 && BankAccount>amount ){
            BankAccount-=amount;

        }
        else{
            System.out.println("error message");
        }

    }

    public int getBankAccount() {
        return BankAccount;
    }
}

