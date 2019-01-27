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
public class AreaRect {
    public static void main(String[] args) {
        double l = 0;
        double b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of a Rectangle: ");
        l = sc.nextDouble();
        System.out.println("ENter the Breath of Rectangle: ");
        b = sc.nextDouble();
        System.out.println("Area: " + l*b);
        System.out.println("Peremeter: " + 2*(l+b));
    }
    
}
