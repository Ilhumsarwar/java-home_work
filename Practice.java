import java.util.*;

// javac filename.java
// java filename


class NumberChecker {
    public static void isPositive(int num){
        if(num >= 0) System.out.println("Positive number");
        else System.out.println("Negative Number");
    }
    public static void isEven(int num){
        if(num%2==0) System.out.println("Even number");
        else System.out.println("Odd Number");
    }
}

public class Practice{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = myObj.nextInt();
        NumberChecker.isPositive(n);
        NumberChecker.isEven(n);    

        myObj.close();
    }
}
