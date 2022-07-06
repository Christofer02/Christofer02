import javax.management.relation.Relation;

public class App {

    public static void main(String[]Arg){
        System.out.printf("\nFor:\n");
        ContadorFor(5);
        System.out.printf("\nWhile:\n");
        ContadorWhile(5);
        System.out.printf("\nDo-While:\n");
        ContadorDoWhile(5);
    }
/*<
Este es un Método :DrawLinea
Presenta una liena de caracteres camelcase nombreApellidoPersona
*/
//Método que dibuja Linea
public static void SumaShort()
   {
// Declaraicon de las Variables
int a=100, b=55;
a = a + b;
System.out.printf("la suma es: %d", a);
   }
    
   public static void DrawLinea()
   {
// Declaraicon de las Variables
int a, b;
char c;
float z;
//Inicialización Variables
b=100;
a=55;
a = a + b;
System.out.printf("la suma es: %d", a);
   }
    //metodo retornar valores : tipo datos (no void) =int, float, char-.....return
    static int SumaPara(int a, int b)//parametros
    {
      
 return a+b;
 
    }
    static void ContadorFor(int t)//parametros
    {
 for(int i=0; i <= t; i++)
 {
    System.out.printf(" d% ",i);
 }     
 
    }
    static void ContadorWhile(int t)//parametros
    {
        int i=0;
        while(i <= t)
        {
            System.out.printf(" d% ",i);
            i++;
        }     
 
    }
    static void ContadorDoWhile(int t)//parametros
    {
        int i=0;
        do
        {
            System.out.printf(" d% ",i);
            i++;
        }  
        while(i <= t);
 
    }
}
