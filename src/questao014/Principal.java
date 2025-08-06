package questao014;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int valor;
        System.out.println("Informe o valor que pagou: ");
        valor = scanner.nextInt();
        System.out.println("Indentifique-se:\n1-Comum\n2-VIP\n3-Funcionário\n");
        int res = scanner.nextInt();
        if(res==1)
        {
            System.out.println("Valor da pizza: " + valor);
        }
        else if(res==2)
        {
            System.out.println("Valor da pizza: " + (valor - (valor*0.05)));
        }
        else if(res==3)
        {
            System.out.println("Valor da pizza: " + (valor - (valor*0.1)));
        }
        else
        {System.out.println("ERRO!");}
    }
}