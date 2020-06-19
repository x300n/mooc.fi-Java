import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        
        int smallest = array[0];
        
        for(int i=1; i<array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        
        return smallest;
        
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int indexos = 0;
        for(int i=0; i<array.length;i++) {
            if(smallest == array[i]) {
                indexos = i;
            }
        }
        return indexos;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        
        for(int i=startIndex+1;i < table.length; i++) {
            if(smallest > table[i]) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i=0; i<array.length - 1; i++) {
            swap(array, i, indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }
    }
}
