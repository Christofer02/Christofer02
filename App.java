import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //declaración
       // max2Numeros();
       drawLinea();
    }

    private static void max2Numeros() {
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese el primer valor: ");
        a=sc.nextInt();
        System.out.printf("ingrese el segundo valor: ");
        b= sc.nextInt();

        if(a>b)
        {
            System.out.printf("El mayor valor es: %d",a);
        }
        else
        {
            System.out.printf("El mayor valor es: %d",b);
        }
        sc.close();
    }
    static void drawCuadrado()
    {
        for(int v=1;v<=10;v++)
        {
            for(int h=1;h<=10;h++){
             
                System.out.printf("* ");
            }
            System.out.printf("* ");
        }
    }
    static void drawLinea()
    {
        for(int i=0;i<10;i=i+1)
        {
            System.out.printf("* ");
        }
    }

}