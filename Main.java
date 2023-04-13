import java.sql.Array;
import java.util.LinkedList;


//
// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
//        На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
//        Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
public class Main {
    public static void main(String[] args) {
//        Задание 1:
        String names = "Иван Иванов\n" +
                "Светлана Петрова\n" +

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

                "Иван Ежов";
        LinkedList list = FirstTask.ListFromString(names);
        System.out.println(list.toString());
        LinkedList namesPhones = FirstTask.CreatePhoneBook(list);
        System.out.println(namesPhones.toString());

    }
}