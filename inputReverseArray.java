import java.util.*;
public class inputReverseArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of an array :- ");
        int n = sc.nextInt();

        int[]arr = new int[n];
        System.out.println("original :- ");
        for(int i = 0; i < n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("reverse number :- ");
        for(int i = arr.length - 1;1 >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}