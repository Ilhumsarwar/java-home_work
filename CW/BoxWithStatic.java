//package CW;


class box{
    double width,height,depth;
    private static int count = 0;
    box(){ 
        count++;
    }
    static void printBoxCount(){
        System.out.println("Current no. of boxes: " + count);
    };
}


public class BoxWithStatic {
    public static void main(String[] args){
    box b1 = new box();
    box.printBoxCount();
    box b2 = new box();
    box b3 = new box();
    box.printBoxCount();
    }
}