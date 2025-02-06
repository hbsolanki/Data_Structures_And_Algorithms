package Sorting;

class Sorting {

    public static void bubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
    
    public static void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int key = i + 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[key] > arr[j]) {
                    key = j;
                }
            }
            //swap
            arr[i] += arr[key];
            arr[key] = arr[i] - arr[key];
            arr[i] = arr[i] - arr[key];
        }
    }

    public static void insertionSorting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j=i-1;
            while (key < arr[i - 1] && j >= 0) {
                arr[i]
            }
        }
    }
    
    public static void arrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = { 22, 4, -5, 1, 7 };
        arrayPrint(arr);
        selectionSorting(arr);
        arrayPrint(arr);
    }
}