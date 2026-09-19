//PQ in JCF:

/*import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueues {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //add - O(logn)
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(logn)
        }
    }
}*/

//PQ for Objects:

/*import java.util.PriorityQueue;

public class PriorityQueues {
    static class Student implements Comparable<Student> { //overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}*/