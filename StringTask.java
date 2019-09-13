package codeforces;

import java.util.Scanner;

public class StringTask
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.toLowerCase();
        String[] arrayList = {"a","e","i","o","u","y"};
        String result="";
        for (int i =0;i<arrayList.length;i++)
        {
            str =str.replace(arrayList[i],"");
        }
        String[] strArray = str.split("");
        for(int i =0;i<strArray.length;i++)
        {
            result=result+"."+strArray[i];
        }
        System.out.println(result);
    }
}
