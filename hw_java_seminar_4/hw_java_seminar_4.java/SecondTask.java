import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.
public class SecondTask {
    public static LinkedList CreateLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        int someNumber = SecondTask.ScanInteger();
        Random random = new Random();
//
        for (int i = 0; i < someNumber; i++) {
            linkedList.add(random.nextInt(-100,100));
        }
        return linkedList;
    }

    public static Integer ScanInteger() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Print the number: ");
        int size = myScan.nextInt();
//        System.out.printf("%s",elements);
//        myScan.close();
        return size;

    }

    public static void enqueue(LinkedList linkedList){
        System.out.println("You have to choose a number you want to add to the queue.");
        linkedList.add(ScanInteger());

    }

    public static Integer dequeue(LinkedList linkedList){
        int firstElement = First(linkedList);
        linkedList.remove(0);
        return firstElement;
    }

    public static Integer First(LinkedList linkedList){
         int firstElement = (int)linkedList.getFirst();
        return firstElement;
    }


}

