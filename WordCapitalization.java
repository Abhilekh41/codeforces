package codeforces;

import java.util.Scanner;

public class WordCapitalization
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String k = str.substring(1,str.length());
        k = String.valueOf(str.charAt(0)).toUpperCase() + k;
        System.out.println(k);
    }
}
