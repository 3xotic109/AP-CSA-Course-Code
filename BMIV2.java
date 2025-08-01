import java.util.Scanner;
public class BMIV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please Enter First and Last Name: ");
        String name = in.nextLine();

        System.out.print("Please Enter Height (Feet and Inches): ");
        String heightFTIN = in.nextLine();
        String heightFeet = heightFTIN.substring(0, 1);
        String heightInches = heightFTIN.substring(2);

        int feet = Integer.parseInt(heightFeet) * 12;
        int inches = Integer.parseInt(heightInches);
        int heighIn = feet+inches;
        double heightMeters = heighIn * 0.0254;
        double roundedHeight = (int)(heightMeters * 10 + 0.5)/10.0;


        System.out.print("Please Enter Weight (Pounds)");
        String weightPounds = in.next();
        double weight = Double.parseDouble(weightPounds);
        double weightKg = weight * 0.45359237;
        double roundedWeightKG = (int)(weightKg * 10 + 0.5)/10.0;

        double bmi = weightKg/(heightMeters * heightMeters);
        String status = null;
        if(bmi < 18.5){
            status = "Underweight";
        }
        else if (bmi > 18.5 && bmi < 24.9 ){
            status = "Normal weight";
        }
        else if (bmi > 25.0 && bmi < 29.9){
            status = "Overweight";
        }
        else{
            status = "Obese";
        }

        System.out.println("                   BMI Calculator                  ");
        System.out.println("===================================================");
        System.out.println("Name: " +  name);
        System.out.println("Height: " + roundedHeight + " Meters");
        System.out.println("Weight: " + roundedWeightKG + " Kg");
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + status);

    }
}
