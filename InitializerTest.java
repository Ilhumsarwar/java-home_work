
class Wallet {
    int balance = 500;
    static int expire = 120;
    {
        balance = 200;
        System.out.println(balance);
    }
    static {
        // balance = 100;
        // System.out.println(balance);
        System.out.println("Hello world");
    }
}

public class InitializerTest{
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        System.out.println(w1.balance);
    }
} 
