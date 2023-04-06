import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//    Почему-то не работает сканнер, пришлось указать n самой
//    Scanner in = new Scanner(System.in);
//    System.out.printf('n: ');
//    int n = in.nextInt();
//    in.close();
        int n = 10;
//        First first = new First();
//        int [] array = First.RandomArray(n);
//        First.mergeSort(array,n);
//        System.out.println(Arrays.toString(first.RandomArray(n)));
//        System.out.println(Arrays.toString(array));

//        Second second = new Second();
//        ArrayList<Integer> arrayList = new ArrayList<>(second.RandomArray(n));
//        System.out.println(second.DeleteEvens(arrayList));

        Third third = new Third();
        ArrayList<Integer> arrayList = new ArrayList<>(third.RandomArray(n));
        System.out.println(arrayList);
        System.out.println(Arrays.toString(third.Minimum((arrayList))));



    }
}