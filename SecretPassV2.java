/**
 * Randomly generate passwords.
 *
 * @author Joshua Chun
 * @version 11/14/2024
 *
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPassV2
{
    public static void main(String [] args) throws IOException
    {

        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0;
        String password = "";

        // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("SecretPass.txt"));



        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        // the user wants to continue
        System.out.println("Would you like to continue? (Y/N)");
        userChoice = in.nextLine();
        while(userChoice.equalsIgnoreCase("Y")){
            outFile = new PrintWriter(new File("SecretPass.txt"));
            password = "";
            System.out.println("How long should your password be? (Minimum of 6)");
            pwLength = in.nextInt();
            if(pwLength < 6){
                System.out.println("Your password is too short");
            }
            else{
                for(int i = 0; i<pwLength; i++){
                    randNum = (int)(Math.random()*(122-33+1)+33);
                    if(randNum >=48 && randNum<= 57) {
                        password += (char) randNum;
                    }
                    else if( randNum >=65 && randNum<= 90){
                        password += (char) randNum;
                    }
                    else if( randNum >=97 && randNum<= 122){
                        password += (char) randNum;
                    }
                    else {
                        i = i-1;
                    }
                    //System.out.println(randNum);
                    //System.out.println(password);
                }
                outFile.println(password);
                outFile.close();
                File pass = new File("SecretPass.txt");
                Scanner inFile = new Scanner(pass);
                String readPass = inFile.nextLine();
                System.out.println(readPass);
                //System.out.println("Would you like to create another?");
                //userChoice = in.nextLine();
            }
        }
    }//end main
}//end class

