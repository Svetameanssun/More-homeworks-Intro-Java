import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/// 1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
public class FirstTask {
    List<String> listPeopleAndTel = new ArrayList<>();


    public List addTelToName(String name){
        List<String> listNameAndTel = new ArrayList<>();
        listNameAndTel.add(name);
        System.out.println("How many numbers does this person have?");
        Scanner myScan = new Scanner(System.in);
        int number = myScan.nextInt();
        System.out.println("Introduce all the numbers:");
        for (int n = 0; n < number; n++) {
            String telephone = myScan.next();
            listNameAndTel.add(telephone);
        }
        return listNameAndTel;
    }

    public HashMap mapPeopleTel(String names){
            HashMap<Integer,List> mapPeopleAndTel = new HashMap<>();
            String[] namesArr = stringToArray(names);
            for (int i = 0; i < namesArr.length; i++) {
                System.out.println(namesArr[i]);
                mapPeopleAndTel.put(i,addTelToName(namesArr[i]));
            }
            return mapPeopleAndTel;
        }


//    public Object returnList(HashMap hashMap, Integer integer){
//         return hashMap.get(integer);
//
//    }


    public String[] stringToArray(String names){
        String[] namesArr = names.split("\n");
        return namesArr;
    }


    public List kdkkd(HashMap hashMap, String name){
        List<List> resultList = new ArrayList<>();
        for (int i = 0; i < hashMap.size(); i++) {
            List<String> oneNameList = (List)hashMap.get(i);
            for (int j = 0; j < oneNameList.size(); j++) {
                String[] array= oneNameList.get(j).split(" ");
                for (int k = 0; k < array.length; k++) {
                    if (array[k].equals(name)){
                        resultList.add(oneNameList);
                    }
                }
            }
        }
        return resultList;

    }




}


