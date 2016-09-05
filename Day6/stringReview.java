import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner scanner = new Scanner(System.in);
    
    int T;
  
    T = Integer.parseInt(scanner.nextLine());
    
    for (int i = 0; i < T; i++ ) {
      // StringBuilder allows to create a mutable string of characters, while String is IMMUTABLE.
      // If we need to work on the string StringBuilder is a better choice.
      StringBuilder odd = new StringBuilder();
      StringBuilder even = new StringBuilder();    
      
      String s = scanner.nextLine();
      
      for (int j = 0; j < s.length(); j++ ) {
        // As I am using StringBuilder, I can directly append characters to the strings
        if (j%2 == 0) { 
          even.append(s.charAt(j));
        } else {
          odd.append(s.charAt(j));
        }
      }
      System.out.println(even + " " + odd);
    }
    
    // Remember to close the scanner!
    scanner.close();
  
  }
}
