//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Iterator;

public class FirstTask {
    public static String ScanString() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Print the elements divided by commas: ");
        String elements = myScan.next();
//        System.out.printf("%s",elements);
        myScan.close();
        return elements;
//        Не написала проверку для пользователя, потому что слишком отвлекает от основной задачи.


    }

    public static LinkedList StringToLinkedList() {
        String myString = FirstTask.ScanString();

        String[] stringArray = myString.split(",");
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < stringArray.length; i++) {
            linkedList.add(stringArray[i]);
        }
        return linkedList;


    }

    public static LinkedList ReverseList(LinkedList linkedList) {
//    Iterator<String> iterator = linkedList.iterator();
//    while(iterator.hasNext()){
//    Я не знаю, как здесь применить Iterator
        LinkedList<String> newList = new LinkedList<>();

        for (int i = linkedList.size()-1; i >-1; i--) {
            Object o = linkedList.get(i);
            newList.add(o.toString());


        }
        return newList;
    }
}

