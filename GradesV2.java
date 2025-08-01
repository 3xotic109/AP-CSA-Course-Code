/**
 *The purpose of this program is to calculate the total points
 * and average grade each time a new score is added to the total.
 *
 * @author Joshua Chun
 * @version 8/26/2024
 */

public class GradesV2 {
    public static void main(String[ ] args) {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        //Calculate average points and print them to the console
        numTests=1;
        testGrade = 95;
        totalPoints = 95;
        average= (double)totalPoints/numTests;
        System.out.println("Test # 1" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (double) totalPoints /numTests;
        System.out.println("Test # 2" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average= (double)totalPoints/numTests;
        System.out.println("Test # 3" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average= (double)totalPoints/numTests;
        System.out.println("Test # 4" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        // Additional Tests
        //Calculate average points and print them to the console
        numTests++;
        testGrade = 76;
        totalPoints+=testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 5" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 97;
        totalPoints+=testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 6" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 85;
        totalPoints+=testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 7" + "\t\t" + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 90;
        totalPoints+=testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 8" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

        //Calculate average points and print them to the console
        numTests++;
        testGrade = 87;
        totalPoints+=testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 9" + "\t\t"  + "Test Grade: " + testGrade + "\t\t" + "Total Points:" + totalPoints + "\t\t" + "Average:" + average);

    }
}