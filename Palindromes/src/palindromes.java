package src;
import java.util.*;
import java.io.*;
public class palindromes {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(new File("Palindromes/src/input.txt"));
    int lines = Integer.parseInt(scan.next());
    while(lines-- > 0){
        String num = scan.next();
        String mun = "";
        for(int i = num.length() - 1; i >= 0; i--){
            mun += num.charAt(i);
        }
        System.out.println(num.equals(mun));
    }
    }
}