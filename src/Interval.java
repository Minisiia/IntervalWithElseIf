import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число від 0 до 100:");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 14)
            System.out.println("Число " + number + " входить до числового проміжку [0 – 14]");
        else if (number >= 15 && number <= 35)
            System.out.println("Число " + number + " входить до числового проміжку [15 – 35]");
        else if (number >= 36 && number <= 49)
            System.out.println("Число " + number + " входить до числового проміжку [36 – 50]");
        else if (number == 50)
            System.out.println("Число " + number + " входить до числових проміжків [36 – 50] та [50 – 100]");
        else if (number >= 51 && number <= 100)
            System.out.println("Число " + number + " входить до числового проміжку [50 – 100]");
        else System.out.println("Число " + number + " не входить до жодного з наявних числових проміжків");
    }
}
