import java.util.Scanner;

public class Main {

    public static Scanner arrayScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("the minimum element in the array is " + findMin(readElements(readInteger())));
    }

    public static int readInteger() { // set array length
        System.out.println("input the number of elements in the array");
        int numberOfElements = arrayScanner.nextInt();
        return numberOfElements;
    }

    public static int[] readElements(int numberOfElements) {
        System.out.println("provide " + numberOfElements + " integers");
        int[] localArray = new int[numberOfElements];
        for (int i = 0; i < localArray.length; i++) {
            localArray[i] = arrayScanner.nextInt();
        }
        return localArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}