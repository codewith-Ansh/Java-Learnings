import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // -------- ARRAYS -------- 
        int[] marks = new int[3];
        marks[0] = 95;
        marks[2] = 97;
        // marks[3] = 55;   // Error
        System.out.println(marks[1]);   // 0
        System.out.println(marks[2]);   // 97

        // length in array
        System.out.println(marks.length);   // 3 (no need of () in length of arrays)

        // sort
        /* NOTE: to use sort functionality we need to import(include) java.util.Arrays */
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 9;
        arr[4] = 6;

        System.out.println(arr[0]); // 5
        Arrays.sort(arr);   // sorts the arr in ascending order
        System.out.println(arr[0]); // 3


        // another way to declare arrays
        int[] array = {95, 96, 99};
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
        System.out.println(array.length);

        // 2D arrays
        int[][] arr2d = {{99, 92, 85}, {100, 78, 89}};
        System.out.println(arr2d[0][0]);
    }
}
