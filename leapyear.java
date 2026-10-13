import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner ak=new Scanner(System.in);
        int year = ak.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("leapyear");
        else
            System.out.println("not a leap year");
    }
}