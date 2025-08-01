/**
 * Purpose is to find the Gravitational force of Saturn
 *
 * @author Joshua Chun
 * @version 11/27/2024
 */

public class PlanetGravity {
    public static void main(String[] args) {
        String name = "Saturn";
        double mass =4.869 * Math.pow(10, 24);
        double diam = 12103.6;
        double grav = Calcgrav(mass, diam);
        header();
        body(mass, diam, grav, name);
    }
    public static double Calcgrav(double mass, double diameter){
        double r = (diameter * 1000)/2;
        double gConst = 6.6743 * Math.pow(10, -11);
        return (double)((int)(((gConst * mass) / Math.pow(r,2))*100))/100;
    }
    public static void header (){
        System.out.println("\t\t\t   Planetary Data\t\t");
        System.out.print("Planet\t");
        System.out.print("Diameter (KM)\t");
        System.out.print("Mass (Kg)\t");
        System.out.println("g(m/s^2)");
        System.out.println("================================================");
    }
    public static void body(double mass, double diameter, double gravity, String name){
        System.out.print(name + "\t");
        System.out.print(diameter + "\t\t\t");
        System.out.print(mass + "\t");
        System.out.print(gravity);
    }
}
