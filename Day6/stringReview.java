import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scanner = new Scanner(System.in);
    
    int T;
  
    T = Integer.parseInt(scanner.nextLine());
    
    for (int i = 0; i < T; i++ ) {
      StringBuilder odd = new StringBuilder();
      StringBuilder even = new StringBuilder();    
      
      String s = scanner.nextLine();
      
      for (int j = 0; j < s.length(); j++ ) {
        if (j%2 == 0) { 
          // even
          even.append(s.charAt(j));
        } else {
          // odd
          odd.append(s.charAt(j));
        }
      }
      System.out.println(even + " " + odd);
    }
    
    scanner.close();
  
  }
}
