import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 1; i < 11; i++) {
            int result = N * i;
            System.out.println(N +" x " + i + " = " + result);
        }
    }
}
