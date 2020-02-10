package com.praveen.EpamTaskCalculator;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Operations are : ");
        System.out.printf("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        System.out.println("Enter first number:");
        String a = s.nextLine();
        System.out.println("Enter second number:");
        String b = s.nextLine();
        System.out.println("Enter Kind of operation");
        int k = s.nextInt();
        while(k > 4 || k < 1){
            System.out.println("Enter valid operation");
            k = s.nextInt();
        }
        Calculate obj;
        String res = null;
        switch(k){
            case 1: obj = new Add();
                    res = obj.operation(a,b);
                    break;
            case 2: obj = new Subtract();
                    res = obj.operation(a,b);
                    break;
            case 3: obj = new Multiply();
                    res = obj.operation(a,b);
                    break;
            case 4: obj = new Divide();
                    res = obj.operation(a,b);
                    break;
        }
        s.close();
        System.out.println("Result is");
        System.out.println(res);
    }
}
