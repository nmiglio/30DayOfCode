import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scanner = new Scanner(System.in);
    
    int T;
  
    T = Integer.parseInt(scanner.nextLine());
    
    for (int i = 0; i < T; i++ ) {
      String odd = "";
      String even = "";    
      
      String s = scanner.nextLine();
      
      for (int j = 0; j < s.length(); j++ ) {
        if (j%2 == 0) { 
          // even
          even = even + s.charAt(j);                    
        } else {
          // odd
          odd = odd + s.charAt(j);
        }
      }
      System.out.println(even + " " + odd);
    }
  
  }
}
