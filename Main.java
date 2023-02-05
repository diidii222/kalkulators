import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        Double x, y, resultats;

        Scanner input = new Scanner(System.in);

        System.out.println("Izvelies opciju: +, -, *, vai /");
        operator = input.next().charAt(0);

        System.out.println("Ievadi skaitli ");
        x = input.nextDouble();

        System.out.println("Ievadi otru skaitli");
        y = input.nextDouble();
        switch (operator) {

            case '+':
                resultats = x + y;
                System.out.println(x + " + " + y + " = " + resultats);
                break;

            case '-':
                resultats = x - y;
                System.out.println(x + " - " + y + " = " + resultats);
                break;

            case '*':
                resultats = x * y;
                System.out.println(x + " * " + y + " = " + resultats);
                break;

            case '/':
                resultats = x / y;
                System.out.println(x + " / " + y + " = " + resultats);
                break;

            default:
                System.out.println("Nepareizi");
                break;
        }

        input.close();
    }



}