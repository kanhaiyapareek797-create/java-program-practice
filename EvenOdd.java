// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class EvenOdd{
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number:");
      int var2 = var1.nextInt();
      if (var2 % 2 == 0) {
         System.out.println("this is even number:" + var1);
      } else {
         System.out.println("this is odd number:" + var2);
      }

   }
}
