import java.util.*;
import java.io.*;

class gfg {
    
  // Function to print a and c
  //comment the line that outputs b
   static void comment(int a, int b, int c){
      
      //Prints a
      System.out.println(a);
      //Prints b
      // System.out.println(b);
      //Prints c
      System.out.println(c);
  }
  
}

public class Comments {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testcase = sc.nextInt();

    //Taking Input
    while(testcase-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      //Creating an object and calling it
      gfg g = new gfg();
      g.comment(a,b,c);
    }
  }
}