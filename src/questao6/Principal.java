package questao6;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Informe o terceiro númeero: ");
        int n3 = scanner.nextInt();

        if(n1<n2 && n1<n3 || n1<n3 && n1<n2) System.out.println("Menor número: " + n1);
        else if(n2<n1 && n2<n3 || n2<n1 && n2<n3) System.out.println("Menor número: " + n2);
        else if(n3<n2 && n3<n1 || n3<n2 && n3<n1) System.out.println("Menor número: " + n3);
        else System.out.println("Todos os números são iguais");
    }
}