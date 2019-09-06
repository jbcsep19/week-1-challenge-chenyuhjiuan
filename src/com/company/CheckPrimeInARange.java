package com.company;

import java.util.Scanner;

public class CheckPrimeInARange {

    public static void main(String args[])
    {
        int s1, s2, s3, flag = 0, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter a number :");
        s1 = s.nextInt();
        System.out.printf("The number you just keyed in is "+s1);
        System.out.println ("The prime numbers between 1 and "+s1+"are :");
        for(i = 1; i <= s1; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
    }
}
