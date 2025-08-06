package questao017;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int t=1, res = 0, c=0;

        System.out.println("Informe um número: ");
        int n = scanner.nextInt();
        for(c=n; c!=0; c--)
            for(int i=0; i<n; i++)
            {

            }
        System.out.println("Fatorial do número " + n + ":\n " + res);
    }
}