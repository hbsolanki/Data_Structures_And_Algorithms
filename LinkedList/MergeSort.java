import java.util.LinkedList;

class MergeSort {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void addFirst(int data) {
        Node newNode=new Node(data);

        if (head == null) {
            
        }
    }
    
    public static void mergeSort(LinkedList<Integer> list) {
       
    }
    
    
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList();
        l.add(2);
        l.add(8);
        l.add(5);
        l.add(1);
        l.add(7);
        mergeSort(l);
        System.out.println(l);
    }
}