public class BubbleSort {

    // Method to perform Bubble Sort
    void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Traverse the array from 0 to n-i-1
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) break;
        }
    }

    // Utility method to print array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test the above functions
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        BubbleSort ob = new BubbleSort();
        System.out.println("Unsorted array:");
        ob.printArray(arr);

        ob.bubbleSort(arr);

        System.out.println("Sorted array:");
        ob.printArray(arr);
    }
}
