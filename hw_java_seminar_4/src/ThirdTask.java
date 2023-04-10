//В калькулятор добавьте возможность отменить последнюю операцию.
import java.util.Scanner;
public class ThirdTask {
    public static double Calculator(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Introduce the 1st integer: ");
        int n = iScanner.nextInt();

        System.out.println("Introduce the operator: ");
        char symbol = iScanner.next().charAt(0);

        System.out.println("Introduce the 2nd integer: ");
        int m = iScanner.nextInt();
        double res = 0;
        if (symbol=='+') res = n+m;
        if (symbol=='-') res = n-m;
        if (symbol=='*') res = n*m;
        if (symbol=='/') res = (double)n/m;
        if (symbol=='%') res = n%m;
//        System.out.println(res);
        System.out.println("Do you want to delete the previous elements? Press 'Y' for 'Yes' or 'N' for 'No'.");
        char answer = iScanner.next().charAt(0);
        if(answer == 'Y' || answer == 'y'){
            return Calculator();
        } else if (answer == 'N'|| answer == 'n') {
            return res;
        }
        iScanner.close();
        return res;


    }
}
