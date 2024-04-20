package Algorithms;

public class Sort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.start();
    }

    private void start() {
        int[] array = {5, 3, 7, 2, 5, 12, 8, 5435, 876, 124, 8, 7};
        printArray(array);
        sort(array);
        printArray(array);
        System.out.println(binarySearch(array, 756756));
    }

    private void sort(int[] array){
        for (int replace = 0; replace < array.length; replace++){
            for (int i = 0; i < array.length - 1 - replace; i++) {
                int first = array[i];
                int second = array[i+1];
                if(first > second){
                    array[i] = second;
                    array[i+1] = first;
                }
            }
        }
    }

    private void printArray(int[] arr){
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private int binarySearch(int[] array, int value){
        int index = -1;
        int low = 0;
        int high = array.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(array[mid] < value){
                low = mid + 1;
            }
            else if(array[mid] > value){
                high = mid - 1;
            }
            else{
                index = mid;
                break;
            }
        }
        return index;
    }
}
