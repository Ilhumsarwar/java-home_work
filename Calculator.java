import java.util.* ;

public class Calculator {
    public static double calc(int n,int m,char c){
        if(c == '+') return n+m;
        else if(c == '-') return n-m;
        else if(c == '*') return n*m;
        else if(c == '/') return (double)n/m;
        else return -1;
    }
    public static void main(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two integers and an operation:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        char c = obj.next().charAt(0);
        System.out.println("Result = " + calc(a,b,c));
    }
}