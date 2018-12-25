
public class Telusko {
    
    public static void main(String[] args) {
        int i,j,k;
        i=5;
        j=4;
        k=i+j;
        int l=0B10000;
 //       int m=0b100_00_00_00_00_00_00;// 101 is the binary representation of 5
                     // to convert an integer to bulina, append "0b" before the number 
        System.out.println("The Addition of "+i+" and  "+j+" is " +k);
        System.out.printf("The Addition of %d and %d is %d",i,j,k);
        System.out.println(l);
//        System.out.println(m);
//        j=++i;
        j=i++;
        k=i;
        System.out.println(j+" : "+k);
    }
}
