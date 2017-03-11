package main.recursion;

/**
 * Created by user on 2/27/2017.
 */
public class BasicExamplesAndNotes {

    public static Integer findOne(Integer input) {
        if (input == 1) return 1;
        else {
            return (input + findOne(input - 1));
        }
    }
    //passing in 6
    /*
     6 + ?
     5 + ?
     4 + ?
     3 + ?
     2 + ?
     1
     2 + 1
     3 + 3
     4 + 6
     5 + 10
     6 + 15 = 21

     Triangle numbers
     1
     2 2 = 3
     3 3 3 = 6
     4 4 4 4 = 10 (count the number of numbers that make up the triangle)
     5 5 5 5 5 = 15
     6 6 6 6 6 6 = 21
     */

     public int getTriangularNumber(int number) {
         int triNumber = 0;

         while (number > 0) {
             triNumber = triNumber + number;
             number--;
         }
         return triNumber;
     }

    public static int getTriangularNumberRecursive(int number) {
        System.out.println("Method: " + number);
         //base case
        if (number == 1) {
            return 1;
        } else {
            int result = number + getTriangularNumberRecursive(number - 1);
            System.out.print("Returned " + result);
            System.out.println(" : " + number + " + getTriN(" + number + " -1)");
            return result;
        }
    }

    public static int getFactorialRecursive(int number) {
        System.out.println("Method: " + number);
        //base case
        if (number == 1) {
            return 1;
        } else {
            int result = number * getFactorialRecursive(number - 1);
            System.out.print("Returned " + result);
            System.out.println(" : " + number + " * getFactorial(" + number + " -1)");
            return result;
        }
    }

}
