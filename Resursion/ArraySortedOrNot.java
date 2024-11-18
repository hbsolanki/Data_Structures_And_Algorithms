class ArraySortedOrNot {
     
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(arraySortedOrNot(arr, 0));
    }
    
    //T.C. O(n) S.C. O(n)
    public static boolean arraySortedOrNot(int arr[], int idx) {
        
        if (idx == arr.length - 1) {
            return true;
        }

        if(arr[idx]>arr[idx+1]){
            return false;
        }

        return arraySortedOrNot(arr, idx + 1);
    }
}