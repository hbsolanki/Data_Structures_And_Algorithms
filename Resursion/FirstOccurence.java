class FirstOccurence {
    

    public static void main(String[] args) {
        int arr[] = { 1, 22, 44, 22, 55 };
        int key = 22;
        int idx = 0;
        System.out.println(firstOccurence(arr, key, idx));

        System.out.println(lastOccurence(arr, key, arr.length-1));
    }
    
    public static int firstOccurence(int arr[], int key, int idx) {

        if (idx >= arr.length) {
            return -1;
        }

        if (arr[idx] == key) {
            return idx;
        }

        return firstOccurence(arr, key, idx + 1);
    }
    
    public static int lastOccurence(int arr[],int key,int idx){
    
        if (idx<0) {
            return -1;
        }

        if (arr[idx] == key) {
            return idx;
        }

        return firstOccurence(arr, key, idx - 1);
    }
}
