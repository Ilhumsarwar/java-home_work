public class cw {
    public static void main(){
        int a = 7,b = 5;
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a+" "+b);
        binary();
    }

    public static void binary(){
        int a = 9, b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a+" "+b);
    }
}
