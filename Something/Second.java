import java.util.Random;
import java.util.ArrayList;

//// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
//package hw_java_seminar_3;
//import java.util.ArrayList;
//import java.util.Collections;
//public class Secondo {
//    public static void main(String[] args) {
//
//    public void randomNumberList(int n){
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i=0; i<10; i++) {
//            numbers.add(Math.random());
//            if
//        }
//        System.out.println(numbers);
//
//        // Collections.sort(numbers);
//
//        // System.out.println(numbers);
//        }
//        Secondo secondTask = new Secondo();
//        secondTask.randomNumberList();
//    }
//}
public class Second {

    public static Integer RandomNums(int n) {
        Random random = new Random();
        int myRandomNumber = random.nextInt(n);
        return myRandomNumber;
    }
    public static ArrayList RandomArray(int n) {
            ArrayList arrayList = new ArrayList();
            int count = n;
            while (count!=0){
                int digit = RandomNums(n);
                arrayList.add(digit);
                count--;
            } return arrayList;
    }
    public static ArrayList DeleteEvens(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            int num = (int)arrayList.get(i);
            if (num%2==0){
                arrayList.remove(i);}
        }
        return arrayList;
    }
}

