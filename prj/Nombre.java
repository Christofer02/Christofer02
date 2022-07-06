import javax.lang.model.util.ElementScanner14;

public class Nombre {
    public static void main(String[]args)throws Exception{
        //Christofer Soria

        drawS(5);
        System.out.printf("");
        drawC(5);
        System.out.printf("");
    }
        static void drawS(int t)
        {
            t=t*2;
            for(int i=1; i<=t; i++)
            {
                for(int j=1;j<=t;j++)
                {
                    if((i ==1 || i==(t/2) ) || i == t || (j == t && i >=(t/2)) || (j == 1 && i <=(t/2))) 
                        System.out.print("*");
                    else 
                    {

                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
        
        static void drawC(int t) 
    {
        for(int i=1; i<=10; i++)
        {
            for(int j=1;j<=10;j++)
            {
                if((i==1 || i == 10) || (j==1 ))
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.printf("\n");
        }
    }
   
}
//i==1 || i ==t || j==1 )