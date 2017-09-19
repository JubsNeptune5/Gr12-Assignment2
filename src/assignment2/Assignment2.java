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

    /**
     * Find the sum of the sum of digits
     *
     * @param n
     * @return
     */
    public int digitRoot(int n) {
        int x = digitSum(n, 0);
        //when the sum of the digits is less then 10, or the last digit of the sum is a zero(ten) 
        if (x < 10 || x % 10 == 0) {
            return x;
        } else {
            return digitRoot(x);
        }
    }

    /**
     * Find the number of blocks in a triangle
     *
     * @param n
     * @return
     */
    public int triangle(int n) {
        //Check if there is even a triangle
        if (n <= 0) {
            return 0;
        }
        //Add the current row plus the next row
        return (n + triangle(n - 1));
    }
/**
 * commence the hailstone pattern
 * @param n
 * @return 
 */
    public int hailstone(int n) {
        //Print out list wwhen the numebr isnt 1;
        if (n != 1) {
            System.out.println(n);
        }
        //return 1 and end the method
        if (n == 1) {
            return 1;
            //Check if the number is even
        } else if (n % 2 == 0) {
            //Divid the numebr by 2
            return hailstone(n / 2);
        } else {
            //Multiply by 3 and add by 1 if the number is even
            return hailstone(3 * n + 1);
        }

    }

    /**
     * Convert a number to binary
     * @param n
     * @return 
     */
    public int binaryConvert(int n){ 
        if(n == 0 ){
            return 0;
        //When the number is oded return a 1 if even return 0
        } else if(n%2 == 0){
            System.out.print(0);
        }else{
            System.out.print(1);
        }
        //Return number divided by two
        return binaryConvert(n/2);
    }
    
    public int convert(int n, int b){
        if( n == 0){
            return 0;
        }else if(n%b<10){
            System.out.print(n%b);
            return convert(n/b,b);
        }else if(n%b == 10){
            System.out.print("A");
        }else if(n%b == 11){
            System.out.print("B");
        }else if(n%b == 12){
            System.out.print("C");
        }else if(n%b == 13){
            System.out.print("D");
        }else if(n%b == 14){
            System.out.print("E");
        }else if(n%b == 15){
            System.out.print("F");
        }else if(n%b == 16){
            System.out.print("G");
        }
        
            return convert(n/b,b);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment2 test = new Assignment2();
        int n = 13;
        int b = 2;
        int[] binary = new int[n];
        //Test A2Q1
        System.out.println("------A2Q1 TEST  Digit Sum-------");
        int A2Q1 = test.digitSum(n, 0);
        System.out.println(A2Q1);
        //Test A2Q2
        System.out.println("------A2Q2 TEST  Digit Root-------");
        int A2Q2 = test.digitRoot(n);
        System.out.println(A2Q2);
        //Test A2Q3
        System.out.println("------A2Q3 TEST  Block Triangle-------");
        int A2Q3 = test.triangle(n);
        System.out.println(A2Q3);
        //Test A2Q4
        System.out.println("------A2Q4 TEST Hailstone Pattern-------");
        int A2Q4 = test.hailstone(n);
        System.out.println(A2Q4);
        //Test A2Q5
        System.out.println("------A2Q5 TEST Binary Convert-------");
        for (int i = 13; i < 10; i++) {
            
        }
        System.out.println(A2Q5);
        //Test A2Q6
        System.out.println("------A2Q6 TEST Base Convert-------");
        int A2Q6 = test.convert(n,b);
        System.out.println(A2Q6);


    }
}
