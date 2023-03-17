import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
    }

        public static int smallest(int[] array){
            int smallest = array[0];
            for(int number: array){
                if (smallest > number){
                    smallest = number;
                }
            }
            return smallest;
        }

        public static int indexOfSmallest(int[] array){
            int number = smallest(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        public static int indexOfSmallestFrom(int[] table, int startIndex) {
            int smallestIndex = startIndex;
            for(int i = startIndex;i < table.length; i++){
                if (table[i] < table[smallestIndex]) {
                    smallestIndex = i;
                }
            }
            return smallestIndex;
        }

        public static void swap(int[] array, int index1, int index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        public static void sort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array));
                swap(array, i, indexOfSmallestFrom(array, i));
            }
        }
        
}
