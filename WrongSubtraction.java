package codeforces;

import java.util.Scanner;

public class WrongSubtraction
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str = s.split(" ");
        Integer value = Integer.parseInt(str[0]);
        Integer remove = Integer.parseInt(str[1]);

        for(int i = 0; i<remove;i++)
        {
          if( value.toString().endsWith("0"))
          {
              value= value /10;
          }
          else
          {
              value = value -1;
          }
        }
        System.out.print(value);
    }
}
