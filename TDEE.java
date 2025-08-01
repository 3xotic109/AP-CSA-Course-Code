import java.util.Scanner;

public class TDEE {
    public static void main (String[] args){
        String name;
        String BM;
        String gender;
        String actLev;
        boolean choice = true;
        boolean male;
        double activity;
        double TDEE;
        double BMR;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Name (First, Last): ");
        name = scan.nextLine();

        System.out.print("What is your BMR? ");
        BM = scan.next();
        BMR = Integer.parseInt(BM);

        System.out.print("What is your gender? (M or F): ");
        gender = scan.next();


        System.out.println("Please select one of the following activity levels: ");
        System.out.println("Resting \t" + "Sedentary \t" + "Light \t" + "Moderate \t" + "Very Active \t" + "Extremely Active \t");
        actLev = scan.next();

        if(!(actLev.equalsIgnoreCase("Resting") || actLev.equalsIgnoreCase("Sedentary") || actLev.equalsIgnoreCase("Light") || actLev.equalsIgnoreCase("Moderate") || actLev.equalsIgnoreCase("Very") || actLev.equalsIgnoreCase("Extremely"))) {
            choice = false;
            System.out.println("That is Not one of the options, please choose one");
            System.out.println("Resting \t" + "Sedentary \t" + "Light \t" + "Moderate \t" + "Very Active \t" + "Extremely Active \t");
            actLev = scan.next();
        }


        male = gender.equalsIgnoreCase("M");
        if(actLev.equalsIgnoreCase("Resting")){
            activity = 1;
        }
        else if(actLev.equalsIgnoreCase("Sedentary")){
            activity = 1.3;
        }
        else if(actLev.equalsIgnoreCase("Light") && male){
            activity = 1.6;
        }
        else if(actLev.equalsIgnoreCase("Light") && !male){
            activity = 1.5;
        }
        else if(actLev.equalsIgnoreCase("Moderate") && male){
            activity =1.7;
        }
        else if(actLev.equalsIgnoreCase("Moderate") && !male){
            activity = 1.6;
        }
        else if(actLev.equalsIgnoreCase("Very") && male){
            activity = 2.1;
        }
        else if(actLev.equalsIgnoreCase("Very") && !male){
            activity = 1.9;
        }
        else if(actLev.equalsIgnoreCase("Extremely") && male){
            activity = 2.4;
        }
        else{
            activity = 2.4;
        }
        TDEE = activity * BMR;

        System.out.println("==================================================");
        System.out.println("Name: " + name +"\t\t" + "Gender: " + gender);
        System.out.println("Your BMR is " + BMR + "\t\t" + "Activity Factor: " + activity);
        System.out.println("TDEE = " + TDEE);


    }
}
