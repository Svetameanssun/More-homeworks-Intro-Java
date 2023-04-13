// 1. Реализовать алгоритм сортировки слиянием
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class First {


    public static Integer RandomNums(int n) {
        Random random = new Random();
        int myRandomNumber = random.nextInt(n);
        return myRandomNumber;
    }

    public static int[] RandomArray(int n) {
//            ArrayList arrayList = new ArrayList();
//            while (n!=0){
//                int digit = RandomNums(n);
//                arrayList.add(digit);
//                n--;
//            } return arrayList;
        int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                array[i] = RandomNums(n);
//                System.out.println(array[i]);
            }
        return array;
    }

//    ВСЕ НИЖЕ я списала, но старалась разобраться!
    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);

    }
    public static void merge(
            int[] array, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                array[k++] = l[i++];
            }
            else {
                array[k++] = r[j++];
            }
        }
        while (i < left) {
            array[k++] = l[i++];
        }
        while (j < right) {
            array[k++] = r[j++];
        }
    }
}
