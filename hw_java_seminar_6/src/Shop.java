import java.util.*;

public class Shop {
    /**
     * Критерии по которым выбираем ноутбук
     */
    private String[] items = {"Ram", "sizeDisplay", "H", "operationSystem"};

    HashSet<Laptop> laptops = new HashSet<>();

    @Override
    public String toString() {
        return "Shop {" +
                " laptops=" + laptops +
                '}';
    }

    /**
     *
     * @param  laptop класса Laptop
     * @return Возращает HashSet с ноутбуками
     */
    public Shop addLaptop(Laptop laptop){
        laptops.add(laptop);
        return this;
    }

    /**
     * выводит в консоль все ноутбуки
     * @return Возращает HashSet с ноутбуками
     */
    public Shop showLaptops(){
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
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
    public HashSet<Laptop> findLaptops2(Map<String, Object> points){
        HashSet<Laptop> foundLaptops = new HashSet<>();
        Iterator<Laptop> iterator = laptops.iterator();
        while(iterator.hasNext()){
            Laptop laptop = iterator.next();

            if(laptop.getRam()>=(Integer)points.get(items[0])
                    && laptop.getSizeDisplay()>=(Integer)points.get(items[1])
                    && laptop.getValueHDD()>=(Integer)points.get(items[2])
                    && laptop.getOperationSystem().equals(points.get(items[3]))){
                foundLaptops.add(laptop);
            }
        }
        return foundLaptops;
    }

    /**
     * Выводит на консоль все ноутбуки которые  выбраны по фильтру
     * @param findLaptops передаем сет с ноутбуками
     */
    public void showFoundLaptops(HashSet<Laptop> findLaptops){
        for (Laptop laptop : findLaptops) {
            System.out.println(laptop);
        }
    }

}
