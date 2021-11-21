package utils;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTest {

    // create arrays with days of the week use for loop
    void arraysWeeks() {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (String day : days) {
            System.out.print(day + " ");
        }
    }

    // create arrays with days of the week
    void arraysWeeks2() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        days.set(2, "Wed");
        for (String day : days) {
            System.out.print(day + " ");
        }
    }

    // code that uses the fill method
    void fillArray() {
        int[] numbers = new int[10];
        Arrays.fill(numbers, 1);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // code that uses the fill method Two-dimensional arrays
    void fillArray2D() {
        int[][] numbers = new int[10][10];
        Arrays.fill(numbers, 1);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    // use the Array class to fcompare method
    void compareArray() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println(Arrays.equals(numbers, numbers3));
    }

    // use the Array class to copy method
    void copyArray() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
    }

    // use the Array class to sort method
    void sortArray() {
        int[] numbers = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // use the Array class to binary search method
    void binarySearch() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println(index);
    }

    public static void main(String[] args) {
        ArraysTest arrays = new ArraysTest();

        arrays.arraysWeeks2();
    }
}
