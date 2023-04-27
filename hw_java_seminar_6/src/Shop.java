import java.util.*;

public class Shop {
    /**
     * Критерии по которым выбираем ноутбук
     */
    private String[] parameters = {"Ram", "sizeDisplay", "memory", "operationSystem"};

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
    public HashMap<String, Object> minFeatures(){
        HashMap<String, Object> userFeatures = new HashMap<>();
        System.out.println("""
                Введите значение, соответствующее необходимому критерию:
                1 - Объем ОЗУ
                2 - Размер дисплея
                3 - Размер диска
                4 - Наименование операционной системы
                       
                """
        );
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < parameters.length ; i++) {
            if(i == parameters.length - 1){
                System.out.println("Введите значение для " + parameters[i] + ": ");
                System.out.println("""
                         Windows
                         Lunix
                         iOS
                        """);
                if(sc.hasNext()){
                    String text = sc.next();
                    userFeatures.put(parameters[i], text);
                }
            } else {
                System.out.println("Введите минимальное значение для " + parameters[i] + ": ");
                if(sc.hasNext()){
                    Integer feature = sc.nextInt();
                    userFeatures.put(parameters[i], feature);
                }
            }
        }
        return userFeatures;
    }

    /**
     * Определяет какие ноутбуки подходят под критерии выбора
     * @param chosenFeatures указываем нобор ключ-значение Map<String, Object> chosenFeatures
     * @return Возвращает сет с перечнем ноутбуков которые удовлетворяют требованиям
     */
    public HashSet<Laptop> findLaptops2(Map<String, Object> chosenFeatures){
        HashSet<Laptop> satisfyingLaptops = new HashSet<>();
        Iterator<Laptop> iterator = laptops.iterator();
        while(iterator.hasNext()){
            Laptop laptop = iterator.next();

            if(laptop.getRam()>=(Integer)chosenFeatures.get(parameters[0])
                    && laptop.getSizeDisplay()>=(Integer)chosenFeatures.get(parameters[1])
                    && laptop.getValueHDD()>=(Integer)chosenFeatures.get(parameters[2])
                    && laptop.getOperationSystem().equals(chosenFeatures.get(parameters[3]))){
                satisfyingLaptops.add(laptop);
            }
        }
        return satisfyingLaptops;
    }

    /**
     * Выводит на консоль все ноутбуки которые  выбраны по фильтру
     * @param foundLaptops передаем сет с ноутбуками
     */
    public void showFoundLaptops(HashSet<Laptop> foundLaptops){
        for (Laptop laptop : foundLaptops) {
            System.out.println(laptop);
        }
    }

}
