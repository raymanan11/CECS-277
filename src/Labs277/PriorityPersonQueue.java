package Labs277;
import java.util.PriorityQueue;

public class PriorityPersonQueue {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Sam", "Smith");
        Person2 p2 = new Person2("Charlie", "Black");
        Person2 p3 = new Person2("Betty", "Brown");
        Person2 p4 = new Person2("Jessica", "Stewart");
        Person2 p5 = new Person2("John", "Friday");
        Person2 p6 = new Person2("Frank", "Foley");

        PriorityQueue<Person2> pqueue = new PriorityQueue<>();
        pqueue.add(p1);
        pqueue.add(p2);
        pqueue.add(p3);
        pqueue.add(p4);
        pqueue.add(p5);
        pqueue.add(p6);

        for(Person2 person : pqueue) {
            System.out.println(person);
        }

        System.out.println();

        while(!pqueue.isEmpty()) {
            System.out.print(pqueue.poll());
            System.out.println();
        }
    }
}
