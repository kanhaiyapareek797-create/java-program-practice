import java.util.Scanner;

public class mark {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:- ");
        int marks = sc.nextInt();
        if (marks >= 60) {
            System.out.println("1st divison");
        }
        else if (marks >= 45 ) {
            System.out.println("2nd divison");
        }
        else if (marks >= 33 ) {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}