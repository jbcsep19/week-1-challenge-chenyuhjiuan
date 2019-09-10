package com.company;

import java.util.Scanner;

public class CheckPrimeInARange {

    public static void main(String args[])
    {
        int s1, flag = 0, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter a positive integer:");
        s1 = s.nextInt();
        System.out.println("The number you just keyed in is "+s1+".");

        for(i = 1; i <= s1; i++)
        {
            for( j = 2; j < i/2; j++)
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
                System.out.println("These are prime numbers: "+i);
            }
            if(flag == 0)
            {
                System.out.println("These are not prime numbers: "+i);
            }
        }


        }
    }

