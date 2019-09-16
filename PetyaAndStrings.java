package codeforces;

import java.util.Scanner;

public class PetyaAndStrings
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str_1 = scan.next().toLowerCase();
        String str_2 = scan.next().toLowerCase();
        char[] str1= str_1.toCharArray();
        char[] str2= str_2.toCharArray();
        boolean flag = false;
        for(int i = 0; i< str1.length;i++)
        {
            int ascii1  = (int) str1[i];
            int ascii2  = (int) str2[i];

            if(ascii1<ascii2)
            {
                flag = true;
                System.out.println("-1");
                break;
            }
            else if(ascii1>ascii2)
            {
                flag = true;
                System.out.println("1");
                break;
            }
        }
        if(!flag)
        {
            System.out.println("0");
        }
    }
}
