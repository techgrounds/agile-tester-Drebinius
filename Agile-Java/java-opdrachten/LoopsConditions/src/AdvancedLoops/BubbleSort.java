package AdvancedLoops;

import java.util.Arrays;

class BubbleSort {                                                                                          //OPDR4.2

    static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < size - i - 1; j++)

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }

        if (!swapped)
            break;
    }
}

        public static void main (String[]args){

            int[] toSort = {2, 7, 5, 10, 4, 9, 3, 1, 8, 6};
            System.out.println(Arrays.toString(toSort));

            BubbleSort.bubbleSort(toSort);

            System.out.println(Arrays.toString(toSort));
        }
    }

 /*   static void bubbleSort(int arr[]) {

        int n = arr.length;
            for (int i=0; i < n; i++)
                for (int j=0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            }
     void printArray(int arr[]) {

         int n = arr.length;
         for (int i = 0; i < n; ++i)
             System.out.print(arr[i] + " ");
     }

     public static void main(String[] args) {
         BubbleSort obj = new BubbleSort();
         int arr[] = {2, 7, 5, 10, 4, 9, 3, 1, 8, 6};
         obj.bubbleSort(arr);
         obj.printArray(arr);
     }
    }  */
