public class UnionFind {

    static int parent[] = new int[7];
    static int rank[] = new int[7];

    public static void init() {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    //Return Parent of x
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parB] > rank[parA]) {
            parent[parA] = parB;
        } else {
            if (rank[parA] == rank[parB]) {
                rank[parA]++;
            }

            parent[parB] = parA;
        }
    }
    
    public static void main(String args[]) {
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        // System.out.println("Find 4 : "+find(4));
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
        System.out.println(find(5));
        
        
    }
}