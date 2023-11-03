import java.util.*;

public class multidimensionalArrays {
    public static void main(String[] args) {
        // // declaring an one-dimensional array
        // int[] marks;
        // marks = new int[2];
        // marks[0] = 100;
        // marks[1] = 99;
        // System.out.println(marks[0]);

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
