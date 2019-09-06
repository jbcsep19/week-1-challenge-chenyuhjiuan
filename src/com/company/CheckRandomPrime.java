package com.company;

import java.util.Random;
import java.util.Scanner;

public class CheckRandomPrime {
    public static void main ( String[] args )
    {   int temp;
        boolean isPrime=true;
        Random r = new Random();

        int num = 1 + r.nextInt(250);

        System.out.println( "My random number is " + num );
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");

    }
}
