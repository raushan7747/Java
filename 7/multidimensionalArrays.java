import java.util.*;

public class multidimensionalArrays {
    public static void main(String[] args) {
        /*

        // declaring an one-dimensional array
        int[] marks; // marks is a class-of-array, meanswhile we can use marks-Class to create
                     // array objects, that's why marks is Class and integer-array type. So, we
                     // can use this integer-array property in other objects to create an array.
        marks = new int[2]; // here's: (new int[2]) this is an object under the marks-Class
        marks[0] = 100;
        marks[1] = 99;
        System.out.println(marks[1]);
        // here's marks-class can be used multiple times to create objects
        marks = new int[2]; // new-keyword is used to create objects, and int[2] is an object which is able
        // to hold two integers, meanswhile resesrve the size for two-integers to store
        // in contiguos memory(an array).
        marks[0] = 98;
        marks[1] = 99;
        System.out.println(marks[0]);
        
        */

        // declaring a two-dimensional array
        int[][] multiArray;
        multiArray = new int[][] { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } }; // using array-literals
        // traversing 2-D array
        for (int elementsInRow = 0; elementsInRow < multiArray.length; elementsInRow++) {
            for (int column = 0; column < multiArray[elementsInRow].length; column++) {
                System.out.print(multiArray[elementsInRow][column]);
            }
            System.out.println(" ");

        }
        int elementsOfAnArray = 0;
        System.out.println("\nThe size of Row, means that how many Rows are there: " + multiArray.length);
        System.out.println("The size of elements in a Row, such as how many columns in an only single Row is: "
                + multiArray[elementsOfAnArray].length);
    }

}
