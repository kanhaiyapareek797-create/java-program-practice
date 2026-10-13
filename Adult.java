import java.util.*;
public class Adult{
public static void main(String[]args){
System.out.println("Enter the value:");
Scanner sc=new Scanner(System.in);
var age=sc.nextInt();
if (age >=18){
System.out.println("Adult");
}
else{
System.out.println("child");
}
}
}