import java.util.*;

// javac filename.java
// java filename

class LeapYear{
    public static void leapYearCheck(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int y = obj.nextInt();
        if(y % 4 == 0 && y % 100 !=0){
            System.out.println("Leap Year");
        }
        else if(y % 400 == 0){
            System.out.println("Leap Year");
        }
        else System.out.println("Not a Leap Year");
    }
}

class Series{

    public static int evenSeries(){
        int evenSum = 0;
        for(int i=2; i<=20; i+=2){
            System.out.print(i+" ");
            evenSum += i;
        }
        System.out.println('\n');
        return evenSum;
    }
    
    public static int oddSeries(){
        int oddSum = 0;
        for(int i=1; i<=19; i+=1){
            System.out.print(i+" ");
            oddSum += i;
        }
        System.out.println('\n');
        return oddSum;
    }
}

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

class ResultCheck {
    public static void check(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int num = obj.nextInt();
        if(num <= 100 && num >= 90) System.out.println("A+");
        else if(num <= 89 && num >= 80) System.out.println("A");
        else if(num <= 79 && num >= 70) System.out.println("A-");
        else if(num <= 69 && num >= 60) System.out.println("B");
        else if(num <= 59 && num >= 50) System.out.println("B-");
        else if(num <= 49 && num >= 40) System.out.println("C+");
        else if(num <= 39 && num >= 0) System.out.println("F");
    }
}

public class Practice{

    public static void main(String[] args){
        //problem 1 cntd
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = myObj.nextInt();
        NumberChecker.isPositive(n);
        NumberChecker.isEven(n);
        
        ResultCheck.check();
        myObj.close();
        System.out.println(Series.evenSeries());
    }
}
