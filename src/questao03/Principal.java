package questao03;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = leitura.nextInt();
        System.out.println("O número é " + (n%2==0? "par" : "ímpar"));
    }
}