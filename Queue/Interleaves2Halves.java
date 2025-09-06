
import java.util.LinkedList;
import java.util.Queue;

public class Interleaves2Halves {

    public static void interleaves(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();
        int half = q1.size() / 2;
        int i=0;
        while (i != half) {
            q2.add(q1.remove());
            i++;
        }
        i=0;

        while(i!=half){
            q1.add(q2.remove());
            q1.add(q1.remove());
            i++;
        }
        System.out.println( q1);
    }
    
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaves(q);
    }
}
