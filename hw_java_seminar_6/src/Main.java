

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addLaptop(new Laptop("LENOVO", 512,  15, 1024,  "HDD", "Windows", "Gray"))
                .addLaptop(new Laptop("HP",     8, 13, 1024, "HDD", "Windows", "Black" ))
                .addLaptop(new Laptop("APPLE",  16, 10 ,1024,  "SSD", "iOS",     "Gray"))
                .addLaptop(new Laptop("ASUS",   4, 14, 1024, "SSD", "Windows", "White"))
                .addLaptop(new Laptop("HP",     16, 15, 1024, "HDD", "Linux",   "Gray"))
                .addLaptop(new Laptop("APPLE",  32, 14, 1024,  "SSD", "iOS",   "Black"))
                .addLaptop(new Laptop("ASUS",   32, 13, 1024, "HDD", "Windows", "Gray"))
                .addLaptop(new Laptop("LENOVO", 16, 15, 1024,  "SSD", "Linux",   "White"));

        shop.showLaptops();
        HashMap<String, Object> filters = shop.askPointsFilter();
        System.out.println(filters);

        HashSet<Laptop> foundLaptop = shop.findLaptops2(filters);
        System.out.println("==========================================");
        shop.showFoundLaptops(foundLaptop);

    }
}
/*
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы.
Реализовать в Java.
----------------------------------------------
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев —
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
