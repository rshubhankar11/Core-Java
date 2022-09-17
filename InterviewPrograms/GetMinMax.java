import java.util.Arrays;

/**
 * GetMinMax
 * Find the minmum and maximum value of an array
 * 
 */
public class GetMinMax {
    /**
     * This method is useing sorting tech to get min and max values
     * 
     * @param a
     * @param n
     * @return
     */
    static pair getMinMaxWithSorting(int a[], int n) {
        // sorting array
        // for(int i=0;i<n;i++){
        // for(int j=i+1;j<n;j++){

        // if(a[i]>a[j]){
        // long temp = 0;
        // temp = a[i];
        // a[i]= a[j];
        // a[j]=temp;
        // }
        // }
        // }
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length - 1];

        return new pair(min, max);

    }

    /**
     * In this method we have used linear search to get min and max valu of an array
     * 
     * @param arr
     * @param n
     * @return
     */
    public static pair getMinMaxWithoutSorting(int arr[], int n) {
        int min = 0;
        int max = 0;
        // When array have only one element
        if (n == 1) {
            min = arr[0];
            max = arr[0];
        }
        // when array have more than one element in it
        if (arr[0] > arr[1]) {
            min = arr[1];
            max = arr[0];
        } else {
            min = arr[0];
            max = arr[1];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new pair(min, max);
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = 6;
        pair minmax = getMinMaxWithoutSorting(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }

}

class pair {
    int min, max;

    public pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}