/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;
public class Table {
    
    public static void main(String[] args) {

//  Write a table
        
//        Scanner obj1 = new Scanner(System.in);
//        System.out.println("Please Enter a number: ");
//        int num1 = obj1.nextInt();
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(num1 + " * " + i + " = " + num1*i);
//        }

//  Create pattern : Square

        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=20;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
//  Create pattern : Triangle

        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }        
        
    }
}
