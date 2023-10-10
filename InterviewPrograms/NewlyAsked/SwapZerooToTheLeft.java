public class SwapZerooToTheLeft {
    /**
     * 
     * In a given array of integers, write the code to move all the 0s to the
     * right
     * hand (or the end) of the array.
     * I/P :- 2,0,3,4,0,5,0,6
     * 
     * O/P :- 2,3,4,5,6,0,0,0
     * 
     * @param args
     */
    public static void main(String[] args) {

        Integer[] intArray = { 2, 0, 3, 4, 0, 5, 0, 6 };
        for (Integer integer : intArray) {
            System.out.print(integer);
        }

        Integer left = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0) {
                int temp = intArray[i];
                intArray[i] = intArray[left];
                intArray[left] = temp;
                left++;
            }
        }
        System.out.println();
        for (Integer integer : intArray) {
            System.out.print(integer);
        }
    }
}
