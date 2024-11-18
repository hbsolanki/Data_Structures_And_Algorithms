class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(nthFibonacci(2));
    }
    

    //T.C. O(2^n) S.C. O(n)
    public static int nthFibonacci(int n) {
        
        if (n == 0 || n == 1) {
            return n;
        }

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}