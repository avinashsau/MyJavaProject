/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;
import java.util.Scanner;
/**
 *
 * @author avinash
 */
public class Avg {
    public static void main(String[] args) {
        double num = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(n) you want to calculate Avg of : ");
        int n = sc.nextInt();
        while(x<=n){
            System.out.println("Input number " + "(" + (int)x + ")" + ":");
            num +=sc.nextInt();
            x += 1;
        }
        double avg = (num/n);
        System.out.println("Average:" + avg);
    }
}