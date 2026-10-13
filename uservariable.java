import java.util.*;
public class uservariable{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter integer value:- ");
int a=sc.nextInt();
System.out.println("Enter a float value:- ");
float b=sc.nextFloat();
System.out.println("Enter a character:- ");
char c=sc.next().charAt(0);
System.out.println("Enter true or false:- ");
boolean d=sc.nextBoolean();
System.out.println("Enter your name:- ");
sc.nextLine();
String name =sc.nextLine();
System.out.println("Int:- " + a);
System.out.println("Float:- " + b);
System.out.println("Char:- " + c);
System.out.println("Boolean:- " + d);
System.out.println("String:- " + name);
}
}