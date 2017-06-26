import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] word;
        word = s.toCharArray();
        int n = s.length();
        int m = 1;
        for(int i = 0; i<n;i++){
                if(word[i]>=65 && word[i]<=90){
                            m=m+1;
                            
                }
                }
        System.out.println(m);
        }
        
    }
