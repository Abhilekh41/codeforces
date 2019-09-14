package codeforces;

import java.util.Scanner;

public class Bit
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String tests = scan.nextLine();
        Integer count = 0;
        for(int i = 0; i<Integer.parseInt(tests);i++)
        {
            String str = scan.nextLine();
            if(str.equals("++X") || str.equals("+X+") || str.equals("X++"))
            {
                count++;
            }
            else if(str.equals("--X") || str.equals("-X-") || str.equals("X--"))
            {
                count--;
            }
        }
        System.out.println(count);
    }
}
