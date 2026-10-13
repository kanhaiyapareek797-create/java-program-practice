import java.util.*;
public class inputmethod{
    static void add() {
        Scanner ad =new Scanner(System.in);
        System.out.println("Enter your frist number:- ");
        int a =ad.nextInt();
        System.err.println("Enter your second number:- ");
        int b =ad.nextInt();
        System.out.println("This is your addition:- "+(a+b));
        System.out.println("This is your Subtraction:- " + (a-b));
        System.out.println("This is your multiplication:- " + (a*b));
        System.out.println("This is your divison:- " +(float)(a/b));
    }
    public static void main(String[] args) {
        add();
    }
}
