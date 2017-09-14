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

    public int digitSum(int n) {

        if (n < 10) {
            return n;
        } else { //if(n >=10&& n<100){
            
        }
        // return 0; 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment2 test = new Assignment2();
        System.out.println("----0-9");
        for (int i = 0; i < 10; i++) {
            int A2Q1 = test.digitSum(i);
            System.out.println(A2Q1);
        }
        System.out.println("---10-19");
        for (int i = 10; i < 20; i++) {
            int A2Q1 = test.digitSum(i);
            System.out.println(A2Q1);
        }
        System.out.println("---20-29");
        for (int i = 20; i < 30; i++) {
            int A2Q1 = test.digitSum(i);
            System.out.println(A2Q1);
        }
        System.out.println("SELF TEST");
        int A2Q1 = test.digitSum(156);
        System.out.println(A2Q1);
            
                
    }
}
