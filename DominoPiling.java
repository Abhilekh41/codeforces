package codeforces;

import java.util.Scanner;

public class DominoPiling
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str = s.split(" ");
        Integer values = Integer.parseInt(str[0])* Integer.parseInt(str[1]);
        System.out.println(values/2);
    }
}
