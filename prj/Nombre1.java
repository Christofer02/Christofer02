public class Nombre1 {
    public static void main(String[]args)throws Exception{
        //Christofer Soria
        drawLetraSC(5);
        System.out.printf("");

    }
    static void drawLetraSC(int t)
    {
        t=t*2;
        for(int i=1; i<=t; i++)
        {
            for(int j=1;j<=(t*2)+1;j++)
            {
                if(((i ==1 || i==(t/2) && j<=t ) || (j == 1)&&(i<=t/2) || i==t || j==(t+2) || ((j==t)&&(i<=t && i>=t/2)))&&(j!=t+1)) 
                    System.out.print("*");
                else 
                {

                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
