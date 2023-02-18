public class MainProgram {

    public static void main(String[] args) {
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 1);
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex]; int ind = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            if (smallest != i) swap(array, smallest, i);
        }
    }
}
