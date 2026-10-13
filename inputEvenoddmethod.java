import java.util.Scanner;
public class inputEvenoddmethod {
    static void Evenodd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        if(n% 2==0)
            System.out.print(n + "  is even number");
        else
            System.out.println(n + "  is odd number");
    }
    public static void main(String[] args){
        Evenodd();
    }
}
