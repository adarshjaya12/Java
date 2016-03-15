package com.series;

/**
 * Created by adarsh on 3/15/2016.
 */
public class Series {
    public static long nSum(int n)
    {
        long sum = 0;
        System.out.println("Sum of numbers upto "+n);
        for(int i=1 ; i <=n ; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n)
    {
        long product =1;
        for(int i=1 ; i <= n ;i++)
        {
            product = product * i;
        }
        return product;
    }

    public  static long fibonacci(int n)
    {
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for(int i=1 ; i < n; i++)
        {
            fib = nMinus2 + nMinus1;
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }


}
