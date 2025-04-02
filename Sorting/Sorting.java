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

    }
    
    public static void countSort(int arr[]) {
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        
        int temp[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            temp[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < max + 1; i++) {
            
            while (temp[i] != 0) {
                arr[k] = i;
                temp[i]--;
                k++;
            }
        }

    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start >=end) {
            return;
        }
        int mid = start + ((end - start) / 2);
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }
    
    public static int [] merge(int arr[], int start, int mid, int end) {
        int temp[]=new int[end-start+1];
        int i = start;
        int j = mid + 1;
        int k=0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <=end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
        return temp;
    }
    
    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int pivot = arr[start];

        while (i < j) {
            
            while (i < end && arr[i] < pivot) {
                i++;
            }

            while (j >= 0 && arr[j] > pivot) {
                j++;
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
        int arr[] = { 22, 4, 5, 1, 7 };
        arrayPrint(arr);
        countSort(arr);
        arrayPrint(arr);
    }
}