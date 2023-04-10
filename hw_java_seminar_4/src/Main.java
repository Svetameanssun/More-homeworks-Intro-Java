import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Запуск задания 1:
//        FirstTask firstTask = new FirstTask();
//        LinkedList myList = FirstTask.StringToLinkedList();
//        LinkedList new_list = FirstTask.ReverseList(myList);
//        System.out.println(new_list);


//        Запуск задания 2:
        SecondTask secondTask = new SecondTask();
        System.out.println("Think of a number of elements in your list.");
        LinkedList<Integer>newList = secondTask.CreateLinkedList();
        System.out.println(newList);
        System.out.println("New 'Enqueued' list: ");
        secondTask.enqueue(newList);
        System.out.println(newList);

        System.out.println("The first element of the list: ");
        System.out.println(secondTask.First(newList));

        System.out.println("First element, removed from the list: ");
        System.out.println(secondTask.dequeue(newList));
        System.out.println("List without the first element: ");
        System.out.println(newList);




//        Запуск задания 3:
//        System.out.println(ThirdTask.Calculator());



    }
}