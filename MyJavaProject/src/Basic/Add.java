package Basic;

import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
    //1.    System.out.println(74+36);            Addition
    //2.    System.out.println("Radhaswami dayal ki daya \n radhaswami sahay");
    //3. DIvision for integer or float char etc
//        int num1=100;
//        int num2=7;
//        double num3=1000.0;
//        double num4=5.0;
//        
//        System.out.println(num1/num2);    // takes only integral value
//        System.out.println(num3/num1); //Double divided by nteger = double
//        System.out.println(num3/num4); // Output Double
//        System.out.println(num1/num4);
//        System.out.println(-5+8*6);
//        System.out.println((55+9)%9);
//        System.out.println(20+-3*5/8);
//        System.out.println(5+15/3*2-8%3);

    //4. Get inputs and add the two numbers
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = in.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + num1*num2);
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
