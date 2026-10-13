import java.util.*;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value:- ");
        double a = sc.nextDouble();

        System.out.println("Enter the second value:- ");
        double b = sc.nextDouble();

        System.out.println("Enter the opreator (+ - * /):- ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
