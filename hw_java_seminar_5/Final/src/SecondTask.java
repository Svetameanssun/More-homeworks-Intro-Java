// 2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SecondTask {
    public List listFromRepeatedNames(String names){
        String[] arrayNames = names.split("\n");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arrayNames.length; i++) {
//            System.out.println(arrayNames[i]);
            String[] oneName = arrayNames[i].split(" ");
            for (int j = 0; j < oneName.length; j++) {
//                System.out.println(oneName[j]);
                if(j%2==0)
                    list.add(oneName[j]);
            }
        }
        return list;
    }

    public HashMap findRepeatedNames(List list){
        HashMap<String,Integer> hashMap = new HashMap<>();
        int count = 0;
        int point = 1;
        while(point< list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (point != i) {
                    if (list.get(point).equals(list.get(i))) {
                        System.out.println(list.get(point));
                        point++;
                    }
                }
            }
            hashMap.put((String) list.get(point), count);
            count++;
        }
        return hashMap;
    }



}
