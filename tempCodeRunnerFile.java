

public class Main {
    
    public static void main(String[] args){

    //  Find the area of a triangle : 0.5 * base * height

        double base = 3.0d, height = 4.0d;
        double area = 0.5 * base * height ;
        System.out.println(area+"\n");

    // Find the volume of a ball: 4/3 * pi * radius^3
        double pi = Math.PI;
        double radius = 4.0d;
        double volume = 4/3 * pi * radius ;
        System.out.println(volume+"\n"); 

    // Find the area of a circle: pi * radius^2
        double circle_radius = 5.0d;
        double area_circle = pi * circle_radius * circle_radius;
        System.out.println(area_circle + "\n");

    // Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9
        double C = 32.0d;
        double F = 9.0*C/5.0 + 32;
        System.out.println(F+"\n");
    
    // Find the area of an equilateral triangle: (√3 / 4) * arm^2
        double arm = 3.0d;
        double area_of_eqtriangle = Math.sqrt(3)/4.0 * Math.pow(arm,2);
        System.out.println(area_of_eqtriangle);
    
    // Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c)) 
    // where s = (a+b+c) / 2
        double a = 3.0d , b = 4.0d, c = 5.0d;
        double s = (a+b+c) / 2;
        double asq = s*(s-a)*(s-b)*(s-c) ;
        double area_of_triangle = Math.sqrt(asq);
        System.out.println(area_of_triangle+"\n");
    }
}
