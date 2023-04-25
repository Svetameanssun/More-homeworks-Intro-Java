package HW_Java_6;

import java.util.*;
import java.util.Map.Entry;

public class Shop {
    /**
     * Критерии по которым выбираем ноутбук
     */
    private String[] items = {"Ram", "sizeDisplay", "valueDrive", "operationSystem"};

    HashSet<Notebook> notebooks = new HashSet<>();

    @Override
    public String toString() {
        return "Shop {" +
                " notebooks=" + notebooks +
                '}';
    }

    /**
     *
     * @param notebook экземпляр класса Ноутбук
     * @return Возращает HashSet с ноутбуками
     */
    public Shop addNotebook(Notebook notebook){
        notebooks.add(notebook);
        return this;
    }

    /**
     * выводит на консоль все ноутбуки
     * @return Возращает HashSet с ноутбуками
     */
    public Shop showNoteBooks(){
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        return this;
    }

    /**
     * Запрашиваем у пользователя минимальные характеристики
     * @return Возвращает МАП с ключами и значениями
     */
    public HashMap<String, Object> askPointsFilter(){
        HashMap<String, Object> points = new HashMap<>();
        System.out.println("""
                Введите значение, соответствующее необходимому критерию:
                1 - Объем ОЗУ
                2 - Размер дисплея
                3 - Размер диска
                4 - Наименование операционной системы
                       
                """
        );
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < items.length ; i++) {
            if(i == items.length - 1){
                System.out.println("Введите значение для " + items[i] + ": ");
                System.out.println("""
                         Windows
                         Lunix
                         iOS
                        """);
                if(sc.hasNext()){
                    String text = sc.next();
                    points.put(items[i], text);
                }
            } else {
                System.out.println("Введите минимальное значение для " + items[i] + ": ");
                if(sc.hasNext()){
                    Integer point = sc.nextInt();
                    points.put(items[i], point);
                }
            }
        }
        return points;
    }

    /**
     * Определяет какие ноутбуки подходят под критерии выбора
     * @param points указываем нобор ключ-значение Map<String, Object> points
     * @return Возвращает сет с перечнем ноутбуков которые удовлетворяют требованиям
     */
    public HashSet<Notebook> findNotebooks2(Map<String, Object> points){
        HashSet<Notebook> foundNotebooks = new HashSet<>();
        Iterator<Notebook> iterator = notebooks.iterator();
        while(iterator.hasNext()){
            Notebook notebook = iterator.next();

            if(notebook.getRam()>=(Integer)points.get(items[0])
                    && notebook.getSizeDisplay()>=(Integer)points.get(items[1])
                    && notebook.getValueHDD()>=(Integer)points.get(items[2])
                    && notebook.getOperationSystem().equals(points.get(items[3]))){
                foundNotebooks.add(notebook);
            }
        }
        return foundNotebooks;
    }

    /**
     * Выводит на консоль все ноутбуки которые  выбраны по фильтру
     * @param findNotebooks передаем сет с ноутбуками
     */
    public void showfoundNotebooks(HashSet<Notebook> findNotebooks){
        for (Notebook notebook : findNotebooks) {
            System.out.println(notebook);
        }
    }

}
