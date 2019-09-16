package codeforces;

import java.util.Scanner;

public class Football
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.contains("1111111") || str.contains("0000000"))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
