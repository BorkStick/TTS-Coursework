import java.util.*;

public class DSDay2 {
    public static void main(String[] args) {
        // Linked Lists
        LinkedList<String> cars = new LinkedList<String>();
        cars.addLast("koala");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(3,"Mazda");
        cars.addFirst("shark");

        cars.get(3);
        System.out.println(cars);


        // Queues
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i=0; i<10; i++)
            myQueue.add(i);
        System.out.println("Elements of queue-"+ myQueue);
        // To remove the head of queue.
        int removedHead = myQueue.remove();
        System.out.println("removed element-" + removedHead);
        // To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);
        System.out.println("Elements of queue-"+ myQueue);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = myQueue.size();
        System.out.println("Size of queue-" + size);

        // Stacks
        Stack<Integer> myStack;
        myStack = new Stack<Integer>();
        myStack.push(1);
        // Pushes 1 to the top of our stack
        // myStack now consists of [1]
        myStack.push(2);
        // myStack now consists of [1, 2]
        myStack.push(3);
        // myStack now consists of [1, 2, 3]
        System.out.println("stack " + myStack);
        System.out.println("poped " + myStack.pop());

        System.out.println("stack after pop" + myStack);
        System.out.println("is stack empty " + myStack.empty());
        System.out.println("poped " + myStack.pop());
        System.out.println("poped " + myStack.pop());
        System.out.println("is stack empty " + myStack.empty());

// ArrayLists = Dynamiclly sized lists that track items by index (Good for searching and sorting)
// HashMaps = store data in maps as key value pairs(great at orginizing unordered data, fast data structure)
// LinkedLists = data is stored as nodes with each node holding a vlaue and pointer to the next node in the list (fast for adding and removing data)
// Queues = interface - first in first out functionality first item added is first item removed
// stacks = first in first



    }
}
