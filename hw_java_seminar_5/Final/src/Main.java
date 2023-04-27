import java.util.List;


//
// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
//        На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
//        Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
public class Main {
    public static void main(String[] args) {
//        Задание 1:
//        Я специально закомментировла, чтобы не нужно было вводить много номеров в первом задании
        String names = "Ivan Ivanov\n" +
                "Svetlana Petrova\n" +

//                "Кристина Белова\n" +
//
//                "Анна Мусина\n" +
//
//                "Анна Крутова\n" +
//
//                "Иван Юрин\n" +
//
//                "Петр Лыков\n" +
//
//                "Павел Чернов\n" +
//
//                "Петр Чернышов\n" +
//
//                "Мария Федорова\n" +
//
//                "Марина Светлова\n" +
//
//                "Мария Савина\n" +
//
//                "Мария Рыкова\n" +
//
//                "Марина Лугова\n" +
//
//                "Анна Владимирова\n" +
//
//                "Иван Мечников\n" +
//
//                "Петр Петин\n" +

                "Ivam Ezhov";
////        First Task
//        FirstTask firstTask = new FirstTask();
//        HashMap hashMap = firstTask.mapPeopleTel(names);
//        System.out.println("Introduce the name of the person to find their numbers:");
//        Scanner myScan = new Scanner(System.in);
//        String nameToFind = myScan.next();
//        System.out.println(hashMap);
//        System.out.println(firstTask.kdkkd(hashMap,nameToFind));


        SecondTask secondTask = new SecondTask();
        List<String> workingList= secondTask.listFromRepeatedNames(names);
        secondTask.findRepeatedNames(workingList);

    }
}