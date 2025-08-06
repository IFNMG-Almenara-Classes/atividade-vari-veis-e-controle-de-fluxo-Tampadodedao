package questao020;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int n = scanner.nextInt();

        if(n%3 == n%5) System.out.println("O número informado é divisível pelos os dois números");
        else
        {
            if(n%3==0) System.out.println("Número divisível por 3");
            else System.out.println("Número divisível por 5");
        }
    }
}