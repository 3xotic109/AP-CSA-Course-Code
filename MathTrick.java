/**
 *
 * @author Joshua Chun
 * @version 11/19/2024
 *
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {

    /**
     *
     ******  DO NOT USE ARRAYS AT ALL,  AND DO NOT CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
     *
     */

    // Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
    // Hint: Use Math.random() to create number in the correct range
    // 		 use modulus to find the last digit and divide by 100 for the first digit.
    //		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
    // 		 while the difference of the digits is less than 2, create a new random number and try again

    public static int getRandomNum()
    {	int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        // complete the method
        num = (int)(Math.random() * (999-100+1) + 100);
        lastDigit = num % 10;
        firstDigit = num / 100;
        while(Math.abs(firstDigit - lastDigit) <2){
            num = (int)(Math.random() * (999-100+1) + 100);
        }
        return num;
    }

    // Step 2 & 4) reverse the digits of a number
    // Hint: to reverse a number without converting it to a String:
    //		create a new variable to store the reversed number
    //		while the original number > 0
    //		for each digit, multiply the new variable by 10 (to make room for the new digit)
    //		then add the last digit (remember modulus?) to the new variable
    //		divide the original number by 10 to get rid of the last digit
    //	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

    public static int reverseDigits (int num) {
        int revNum = 0;
        while(num > 0){
            for(int i = 0; i<3; i++) {
                revNum = (revNum * 10) + (num % 10);
                num = num / 10;
            }
        }
        return revNum;
        // complete the method
    }

    // Step 7) replace characters in a String according to the chart
    // Hint: Loop through the String and "replace" the numbers with the corresponding letter
    public static String replaceLtr(String str)
    {
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='0'){
                str = str.replace(str.substring(i, i+1), "Y");
            }
            else if(str.charAt(i)=='1'){
                str = str.replace(str.substring(i,i+1), "M");
            }
            else if(str.charAt(i)=='2'){
                str = str.replace(str.substring(i,i+1), "P");
            }
            else if(str.charAt(i)=='3'){
                str = str.replace(str.substring(i,i+1), "L");
            }
            else if(str.charAt(i)=='4'){
                str = str.replace(str.substring(i,i+1), "R");
            }
            else if(str.charAt(i)=='5'){
                str = str.replace(str.substring(i,i+1), "O");
            }
            else if(str.charAt(i)=='6'){
                str = str.replace(str.substring(i,i+1), "F");
            }
            else if(str.charAt(i)=='7'){
                str = str.replace(str.substring(i,i+1), "A");
            }
            else if(str.charAt(i)=='8'){
                str = str.replace(str.substring(i,i+1), "I");
            }
            else if(str.charAt(i)=='9'){
                str = str.replace(str.substring(i,i+1), "B");
            }
        }

        // complete the method
        return str;
    }

    // Step 8) reverse the letters in a String
    // Hint: start with an empty String variable
    //		 loop through the original word
    //		 add one letter at time to the new variable using concatenation and .substring()
    public static String reverseString(String str) {
        // complete the method
        String empt = "";
        for(int i = 0; i<str.length(); i++){
            empt = str.substring(i, i+1) + empt;
        }
        return empt;
    }

    public static void main(String[] args)
    {
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
        int num1 = getRandomNum();
//		2.	Now reverse the digits to form a second number.
        int num2 = reverseDigits(num1);
//		3.	Subtract the smaller number from the larger one.
        int num3 = Math.abs(num1 - num2);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
        int num4 = reverseDigits(num3) + num3;
//		5.	Multiply by one million.
        int num5 = num4 * 1000000;
//		6.	Subtract 733,361,573.
        int num6 = num5 - 733361573;
//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String num7 = String.valueOf(num6);
        String num8 = replaceLtr(num7);
//		8.	Now reverse the letters in the string to read your message backward.
        String num9 = reverseString(num8);
        System.out.println(num9);
    } // end main
} // end class