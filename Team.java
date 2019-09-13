package codeforces;

import java.util.Scanner;

public class Team
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String tests = scan.nextLine();
        Integer counter =0;
        for(int i = 0;i<Integer.parseInt(tests); i++)
        {
            String str = scan.nextLine();
            String[] strList = str.split(" ");
            if(Integer.parseInt(strList[0])
                    +Integer.parseInt(strList[1])
            +Integer.parseInt(strList[2])>=2)
            {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
