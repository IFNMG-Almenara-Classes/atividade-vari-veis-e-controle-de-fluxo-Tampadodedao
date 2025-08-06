package questao013;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        for(int c=0; c!=5;)
        {
            System.out.println("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
            int res = scanner.nextInt();
            if(res>5 || res<1) continue;
            else if(res==1)
            {
                System.out.println("Informe o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.println("Iforme o segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Resultado: " + (n1+n2));
            }
            else if(res==2)
            {
                System.out.println("Informe o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.println("Iforme o segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Resultado: " + (n1-n2));
            }
            else if(res==3)
            {
                System.out.println("Informe o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.println("Iforme o segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Resultado: " + (n1*n2));
            }
            else if(res==4)
            {
                System.out.println("Informe o primeiro número: ");
                int n1 = scanner.nextInt();
                System.out.println("Iforme o segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Resultado: " + (n1/n2));
            }
            else break;
        }
    }
}