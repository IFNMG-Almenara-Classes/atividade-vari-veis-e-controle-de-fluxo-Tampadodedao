package questao012;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int x = 0, par = 0, ss = 0, c = 0;
        do
        {
            System.out.println("Informe valores inteiros: ");
            x = scanner.nextInt();
            if(x!=0)
            {
                if(x%2==0){ss += x; par++; c++;}
                else {ss+=x; c++;}
            }
            
        }while(x!=0);
        System.out.println("Números pares informados: " + par + "\nMédia dos números informados: " + (ss/c));
    }
}