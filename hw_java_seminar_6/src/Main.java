import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.addLaptop(new Laptop("1","Windows 10", "1024 Gb", "8 GB","red", "3000$"))
                .addLaptop(new Laptop("2","Windows 8", "1024 Gb", "4 GB","blue", "2500$"))
                .addLaptop(new Laptop("3", "Linux", "1024 Gb", "16 GB","black", "4000$"))
                .addLaptop(new Laptop("4","MacOS", "1024 Gb", "8 GB","black", "6000$"));
        for (int i = 0; i < dataBase.getList().size(); i++) {
            System.out.println(dataBase.getList().get(i));
        }

        System.out.println("Введите цифру, соответствующую ОС, которую вы выбрали:\n1 - Windows 10\n2 - Windows 8\n3 - Linux\n4 - MacOS");
        Scanner myScan = new Scanner(System.in);
        String number = myScan.next();
        Laptop chosen = dataBase.chooseLaptop(number);
        System.out.println(chosen);

    }
}