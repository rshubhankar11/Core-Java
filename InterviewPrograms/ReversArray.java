/**
 * ReversArray
 */
public class ReversArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        reversArrayMethod(array);

        // for (int i = array.length - 1; i >= 0; i--) {
        // System.out.println(array[i]);
        // }
    }

    public static void reversArrayMethod(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int temp = 0;
        printArray(array, array.length);
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        printArray(array, array.length);
    }

    static void printArray(int arr[],
            int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}