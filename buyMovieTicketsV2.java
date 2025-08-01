import java.util.Scanner;

public class buyMovieTicketsV2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        String name;
        String date;
        String nameOfItem;
        String quantity;
        int quant;
        String price;
        double priceNum;
        String debitNumber;
        String debitPin;
        char firstInitial;

        System.out.println("Good evening");
        System.out.print("Enter your name (First and Last): ");
        firstName = in.nextLine();
        firstInitial = firstName.charAt(0);
        int space = firstName.indexOf(" ");
        lastName = firstName.substring(space);
        name = firstInitial + lastName;


        System.out.print("Enter the current date(mm/dd/yy): ");
        date = in.nextLine();
        String dateDash = date.replace("/", "-");



        System.out.print("Please put the name of the movie you would like to watch: ");
        nameOfItem = in.nextLine();


        System.out.print("How many tickets would you like? ");
        quantity = in.nextLine();
        quant=Integer.parseInt(quantity);


        System.out.print("How much does each ticket cost? ");
        price = in.nextLine();
        priceNum=Double.parseDouble(price);


        System.out.print("Enter your debit number (####-###-####): ");
        debitNumber = in.nextLine();
        String debitNumber1 = debitNumber.substring(9);
        int debNum = Integer.parseInt(debitNumber1);




        System.out.print("Enter your debit pin (####) ");
        debitPin = in.nextLine();

        System.out.println("***************************************************");
        System.out.println("***************************************************");
        System.out.println("Your e-Receipt" + "\n");
        System.out.println(dateDash);
        System.out.println("Order Number: ra015 \n");
        System.out.println("\t" + name);
        System.out.println("\t" + "Account: " + "####-###-" + debNum);
        System.out.println("\t" + "Movie: " + nameOfItem);
        System.out.println("\t" + "Number of tickets: " + quantity);
        System.out.println("\t" + "Ticket price: " + price);
        double finalPrice = priceNum*quant;
        System.out.println("\t" + finalPrice + " will be debited to your account");
        System.out.println();
        System.out.println("Thank you, enjoy your night");
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("***************************************************");




    }
}
