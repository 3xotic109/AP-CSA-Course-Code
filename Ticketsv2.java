 import java.util.Scanner;

/**
 * @author Joshua Chun
 * @version 10/25/2024
 */
public class Ticketsv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price;
        boolean responder;
        boolean veteran;

        System.out.print("Please enter your name (First Last): ");
        String name = in.nextLine();

        System.out.print("Please enter your age: ");
        String age = in.next();
        int ageNum = Integer.parseInt(age);

        System.out.print("Are you a first responder?(Yes or No) ");
        String first = in.next();
        responder = first.equalsIgnoreCase("yes");

        System.out.print("Are you a veteran?(Yes or No) ");
        String vet = in.next();
        veteran = vet.equalsIgnoreCase("yes");

        if(ageNum >18){
            price = 12;
        }
        else if(ageNum>=3 && ageNum<=5){
            price = 9;
        }
        else if(ageNum>=6 && ageNum<=18){
            price = 11;
        }
        else{
            price = 2;
        }

        if(veteran || responder && ageNum>18){
            price = price/2;
        }
        String id;
        int spaceInd;
        spaceInd = name.indexOf(" ");
        String lastName = name.substring(spaceInd+1);
        id = name.charAt(0) + lastName + (int)(Math.random() * 1000)+ 1 ;
        printTicket(name, price, id);

    }
    public static void printTicket(String name, double price, String id){
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your ID is " + id);
        System.out.println("Your price is $ " + price + ".");
        System.out.println("Have a great time at the APCS Carnival today!");
    }
}
