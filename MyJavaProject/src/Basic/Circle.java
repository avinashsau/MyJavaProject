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
public class Circle {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = io.nextDouble();
        System.out.println("Perimeter is = " + (2*radius*Math.PI));
        System.out.println("Area is: " + (Math.PI*radius*radius));
    }
}
