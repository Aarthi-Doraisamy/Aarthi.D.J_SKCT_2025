import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        System.out.print(count);
        
        
    }
}
