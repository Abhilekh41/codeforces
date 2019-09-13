
package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WayTooLongWords
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String noOfWords = scan.nextLine();
        String result ="";
        char[] characterArray = new char[4];
        char[] characterArray1 = new char[3];
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i< Integer.parseInt(noOfWords) ; i++)
        {
            String word = scan.nextLine();
            if(word.length()>10)
            {

                Integer length = word.length();
                if(length==11)
                {
                    characterArray1[0] = word.charAt(0);
                    characterArray1[1] = '9';
                    characterArray1[2] = word.charAt(word.length()-1);
                    stringList.add(String.valueOf(characterArray1));
                }
                else
                {
                    characterArray[0] = word.charAt(0);
                    Integer j = ((length-2)/10);
                    characterArray[1]=j.toString().charAt(0);
                    Integer k = ((length-2)%10);
                    characterArray[2]=k.toString().charAt(0);
                    characterArray[3] = word.charAt(word.length()-1);
                    result =String.valueOf(characterArray);
                    stringList.add(result);
                }
            }
            else {
                stringList.add(word);

            }
        }
        for(int i = 0; i<stringList.size();i++)
        {
            System.out.println(stringList.get(i));
        }
    }
}
