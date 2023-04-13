import java.lang.reflect.Array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/// 1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class FirstTask {

    public static LinkedList ListFromString(String names){
        String [] array = names.split("\n");
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
//            String elem = array[i];
            linkedList.add(array[i]);
//            for (int j = 0; j < array[i].length(); j++) {
//                linkedList.add(elem);
        }
        return linkedList;
    }

    public static LinkedList CreatePhoneBook(LinkedList list){

//        LinkedList<String> subList = new LinkedList<>();
//        LinkedList<LinkedList> newList = new LinkedList<>();
//        newList.add(null);
//        newList.add(null);
//  Здесь я хотела сделать список из подсписков,чтобы можно было добавлять сколько угодно номеров
//  Но у меня не получается, в подсписке сохраняется последний введенный номер
//  Похоже нужно делать через МАССИВ с огранисенным кол-вом номеров
//        for (int i = 0; i < list.size(); i++) {
//            Scanner myScan = new Scanner(System.in);
//            System.out.println(list.get(i));
//            System.out.println("How many numbers does this person have?");
//            int manyNumb = myScan.nextInt();
//            for (int j = 0; j < manyNumb; j++) {
//                subList.set(0,list.get(i).toString());
//                subList.set(1,myScan.nextLine());
//                System.out.println("tel. number: ");
//                newList.add(subList);


//            myScan.close();
        String [] array = new String[3];//в пограмме нельзя вводить больше чем три телефонных номера!
        LinkedList<String[]> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < array.length; j++) {
                Scanner myScan = new Scanner(System.in);
                System.out.println("Introduce numbers:");
//                String telNumber = myScan.next();
                array[j] = myScan.next();
            }
            newList.add(array);

        }

        return newList;

    }

    }

//    public static HashMap PhoneBook(){
//
//        HashMap<Integer, LinkedList> hashMap = new HashMap<>();
//
//
//
//    }

