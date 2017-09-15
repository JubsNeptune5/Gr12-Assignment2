/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author laveh2107
 */
public class Assignment2 {

    /**
     * Method to find the sum of all the digits of a integer
     *
     * @param n
     * @param sum
     * @return
     */
    public int digitSum(int n, int sum) {

        //check if the number has only one digit
        if (n < 10) {
            //have the one and only digit added to the sum to produce an answer
            sum = n + sum;
            return sum;
        } else {
            //fint the remainder of the number divided by ten to show you the last digit of a number
            int d = n % 10;
            //Add the last digit to the sum od the digits
            sum = sum + d;
            //Return the number divided by 10 to lose a digit place, and the sum of the digits
            return digitSum(n / 10, sum);
        }
        // return 0; 
    }

    public int digitRoot(int n) {
        int x = digitSum(n, 0);
        //x=x/10;
        if (x < 10) {
           // x=x*10;
            System.out.println("x<10");
            System.out.println(x);
            return x;
        } else {
            System.out.println("x");
            System.out.println(x);
            return digitRoot(x);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment2 test = new Assignment2();
        int n = 999999999;
        //Test A2Q1
        System.out.println("------A2Q1 TEST-------");
        int A2Q1 = test.digitSum(n, 0);
        System.out.println(A2Q1);
        //Test A2Q2
        System.out.println("------A2Q2 TEST-------");
        int A2Q2 = test.digitRoot(n);
        System.out.println(A2Q2);


    }
}
