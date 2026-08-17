import java.util.*;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        prob3_1_4.greatest_num();
        // prob3_2.medel();
    }
}

class prob3_1_4 {
    static double greatest_num() {
        double mx = -1;
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();

        double arr[];
        arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = myobj.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        System.out.println(mx);
        return mx;
    }

    static double avg() {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();

        double arr[];
        arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = myobj.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];
        }
        System.out.println(sum / n);
        return sum / n;
    }
}

class prob3_2 {
    static void medel() {
        Scanner obj = new Scanner(System.in);
        double grade = obj.nextDouble();
        if (grade >= 3.5 && grade <= 4) {
            System.out.println("Got MEDEL!");
        } else if (grade < 3.5 && grade >= 2) {
            System.out.println("Passed");
        } else if (grade < 2)
            System.out.println("Fail");
        else
            System.out.println("Error Grade");
    }
}

class prob3_5{
    static boolean is_prime(){
        Scanner obj = new Scanner(System.in);  
        int n = obj.nextInt();
        if(i==2){ System.out.println("Prime") ; return true;}
        for(int i  =2;i*i<=n;i++){

        }
    }
}
