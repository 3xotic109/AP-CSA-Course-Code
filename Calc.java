/**
 * The DBA_Code Class inputs a number, finds the value of the number divided by 2
 * as well as the remainder of when it is divided by 2. It will then output the decimal
 * value when divided by 2
 *
 * @author Joshua Chun
 * @version 08/26/2024
 */

public class Calc {
    public static void main (String[] args){
        int value = 9;
        int dividend = 2;
        int divide = value/dividend;
        int modulus = value%dividend;
        double output = (double)value/(double)dividend;
        System.out.println("The Original Value is " + value);
        System.out.println("When " + value + " is divided by " + dividend + ", the whole number result is " + divide);
        System.out.println("The remainder of " + value + " divided by " + dividend + " is " + modulus);
        System.out.println("When " + value + " is divided by " + dividend + " the decimal output is " + output);

    }
}
