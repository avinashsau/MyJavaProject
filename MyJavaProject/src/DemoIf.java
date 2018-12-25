

public class DemoIf {
    public static void main(String[] args) {
        
        Object obj1;
        Object obj2;
        
        if(true)
        {   obj1=new Integer(10);}
        else
        {   obj1=new Double(15.0);}
        System.out.println(obj1);
        
        obj2=true?new Integer(10):new Double(15.0);
        System.out.println(obj2);
        
        
        
        
        
        
        /*  int i = 4;
        int j = 5;
        
        if(i==1)
            j = 6;
        else
            j = 7;
        System.out.println(j);
      */  

       /* int num1 = 39249;
        if(num1%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("ODD");
        }
      */
    }
}
