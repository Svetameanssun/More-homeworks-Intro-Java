// 3. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class Third {
    public static Integer RandomNums(int n) {
        Random random = new Random();
        int myRandomNumber = random.nextInt(n);
        return myRandomNumber;
    }

    public static ArrayList RandomArray(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = n;
        while (count != 0) {
            int digit = RandomNums(n);
            arrayList.add(digit);
            count--;
        }
        return arrayList;
    }

    public static int[] Minimum(ArrayList arrayList) {

        int minimum = (int)arrayList.get(0);
        int maximum = (int)arrayList.get(0);
        int mid = (int)arrayList.get(0);

        for (int i = 0; i < arrayList.size()-1; i++) {
            if (minimum>(int)arrayList.get(i+1)){
                minimum = (int)arrayList.get(i+1);
            }
            if (maximum < (int)arrayList.get(i+1)){
                maximum = (int)arrayList.get(i+1);
            }
            mid = mid+(int)arrayList.get(0);

// Под средним я понимаю среднее арифметическое
    }
        int[] values = {minimum, maximum,mid/arrayList.size()};
        return values;
}
}
