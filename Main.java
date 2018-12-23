import java.util.Scanner;
/*
    Challenge by Tim Buchaka: Java Masterclass Udemy
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
     // array and sort them and return the new sorted array.
 */


public class Main {

    //Scanner for user input
    private static Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {

       //Get user input for array size.
        System.out.println("Please enter the size of your array.\r");

        // Use getInteger method to fill the array
        // Use intScanner to set array size
        int intArray[] = getInteger(intScanner.nextInt());

        // Print out initial array for debugging reason
        System.out.println("The initial array is: ");
        for (int i = 0; i<intArray.length; i++){
            System.out.println("Index: " + i + " | Value: " + intArray[i]);
        }
    }

    public static int[] getInteger(int number){

        // Number takes the array size that was initialized above
        System.out.println("Enter " + number + " integers to be put into an array.");

        // Create new array of size "number" to store input
        int inputArray[] = new int[number];

        // For loop getting user input until the array is full
        for (int i=0; i<inputArray.length; i++){
            inputArray[i] = intScanner.nextInt();
        }

        return inputArray;
    }

    public static int[] descendingQuickSort(int intArray[]){



        return sortedArray;
    }

}
