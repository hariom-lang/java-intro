public class basicsorting {
     // Bubble sort method
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // selection sort method                                                                                                                                          
    public static void selectionsort(int arr[]) {
       for (int i = 0; i <arr.length-1; i++) {
        int minpos = i;
           for (int j = i+1 ; j < arr.length; j++) {
               if(arr[minpos]>arr[j]){
                minpos = j;
               }
               
           }
           // swap 
           int temp = arr[minpos];
           arr[minpos]= arr[i];
           arr[i] = temp;
                                                                                                                                                                                                                                                                     
       } 
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
    //finding out the correct pos to insert
        while (prev >= 0 && arr[prev] > curr) {
            arr[prev + 1] = arr[prev];
            prev = prev - 1;
        }
            arr[prev + 1] = curr;
            }
        }

        // Print array method
        public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }


    // Main method
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
       // bubbleSort(arr);  // Sorting the array
       //selectionsort(arr);
       insertionSort(arr);
        printArr(arr);    // Printing the sorted array
    }
}