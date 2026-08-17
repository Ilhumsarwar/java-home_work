import java.util.Scanner;

class Car{
    static int totalCar = 0;
    String name , model;
    Car(){
        
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Your car's name:"); 
     name = myObj.nextLine();
     
    System.out.println("Enter Your car's model:");
     model = myObj.nextLine();
    
    totalCar++;
        System.out.println("You have created a car of model: "+ model);
    }
    static void numOfCars(){
        System.out.println("Total cars in the showroom: "+totalCar);
    }
}

public class CarProblem {
    public static void main(String[] args){
        Car car1 = new Car();
        
        Car car2 = new Car();
        Car.numOfCars();
    }

}
