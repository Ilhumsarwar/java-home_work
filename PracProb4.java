
class Wallet2{

    private int balance = 500;
    
    void deposit(int amount){
        balance += amount;
        System.out.println(amount + " tk is deposited");

    }
    
    void withdraw(int amount){
        if(balance > amount){
        balance -= amount;
        System.out.println(amount + " tk is withdrawn");
    }
        else{
            System.out.println("Money Withdraw failed. Not enough balance.");
        }
    }

    void balanceCheck(){
        System.out.println("Current Balance: " + balance);
    }
}


class Wallet{
    static int counter;
    private int balance = 0;
    private final int ID;

    Wallet(){
        
        this(0);
        // balance += 0;
    }

    Wallet(int initialBalance){
        balance += initialBalance;
        counter++;
        ID = counter;
    }

    void deposit(int amount){
        balance += amount;
        System.out.println(amount + " tk is deposited");

    }
    
    void withdraw(int amount){
        if(balance > amount){
        balance -= amount;
        System.out.println(amount + " tk is withdrawn");
    }
        else{
            System.out.println("Money Withdraw failed. Not enough balance.");
        }
    }

    void accInfo(){
        System.out.println("Account ID: "+ ID);
        System.out.println("Current Balance: " + balance);
    }
}


class Wallet4{
    static int counter;
    private int balance = 0;
    private final int ID;
    String withdrawMethod = "Unknown";

    Wallet4(){
        // counter++;
        // ID = counter;
        this(0);
        // balance += 0;
        // counter++;
        // ID = counter;
    }
    Wallet4(int initialBalance){
        balance += initialBalance;
        counter++;
        ID = counter;
    }

    void deposit(int amount){
        balance += amount;
        System.out.println(amount + " tk is deposited");

    }
    
    void withdraw(double amount){
        if(balance >= amount){
        balance -= amount;
        System.out.println(amount + " tk is withdrawn");
    }
        else{
            System.out.println("Money Withdraw failed. Not enough balance.");
        }
    }
    void withdraw(double amount , String withdrawMethod){
        if(balance >= amount){
        balance -= amount;
        System.out.println(amount + " tk is withdrawn");
        }
        else{
            System.out.println("Money Withdraw failed. Not enough balance.");
        }
        this.withdrawMethod = withdrawMethod;

    }

    void accInfo(){
        System.out.println("Account ID: "+ ID);
        System.out.println("Current Balance: " + balance);
        System.out.println("Output mode:" + withdrawMethod);
    }

    static int addBonus(Wallet4 w, int amount){
            w.balance += amount;
            System.out.println("bonus is added of "+w.balance+" in "+ w.ID);
            return w.balance;
        }
    static void swap(Wallet4 w1, Wallet4 w2){
        Wallet4 temp = w1;
        
    }
}

class walletTask5{
    int balance = 0;
    walletTask5(int initialBalance){
        balance += initialBalance;
    }
    void accInfo(){
    System.out.println("");
    }
}

class utility{
    static void addBonus(walletTask5 w , int amount){
        w.balance += amount;
        System.out.println("Bonus of "+amount+" is added.");
    }

}

public class PracProb4 {
    public static void main(String[] args){
    
    // Wallet balance_1 = new Wallet();
    // balance_1.deposit(1000);
    // balance_1.accInfo();
    // balance_1.withdraw(500);
    // balance_1.accInfo();
    // Wallet balance_2 = new Wallet(500);
    // balance_2.accInfo();

    Wallet4 balance_1 = new Wallet4(1000);
    balance_1.withdraw(1000,"ATM");
    balance_1.accInfo();

    Wallet4 balance_2 = new Wallet4(1000);
    balance_2.withdraw(1000,"ATM");
    balance_2.accInfo();

    Wallet4 wallet1 = new Wallet4();
    Wallet4.addBonus(wallet1, 500);
    Wallet4 wallet2 = wallet1 ;
    // wallet2 = balance_1;
}
}





// class Wallet1{
//     //process oriented way
//     static int balance_1,balance_2;

//     int deposit(int balance,int amount){
//         balance_1 = balance + amount;
//         return balance_1;
//     }
//     int withdraw(int balance,int amount){
//         balance_2 = balance - amount;
//         return balance_2;
//     }

//     public static void main(String[] args) {
        
//     }
// }