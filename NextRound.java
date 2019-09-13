package codeforces;

import java.util.Scanner;

public class NextRound
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String scan1 = scanner.nextLine();
        String scan2 = scanner.nextLine();
        Integer counter =0;
        String[] list = scan1.split(" ");
        String[] noList = scan2.split(" ");
        Integer index = Integer.parseInt(list[1]);

        for(int i = 0; i<Integer.parseInt(list[0]);i++)
        {
            if(Integer.parseInt(noList[i])>=Integer.parseInt(noList[index-1]) && Integer.parseInt(noList[i])>0)
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
