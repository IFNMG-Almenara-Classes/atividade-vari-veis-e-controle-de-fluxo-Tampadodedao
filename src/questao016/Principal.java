package questao016;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = scanner.nextInt();
        System.out.println("Tabuada do " + n);
        for(int c=1; c<=10; c++)
        {
            System.out.println(n + " x " + c + " = " + c*n);
        }
        for(int c=1; c<=10; c++)
        {
            System.out.println(c*n + " / " + c + " = " + n);

        }
    }
}