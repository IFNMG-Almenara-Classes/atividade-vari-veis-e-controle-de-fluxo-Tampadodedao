package questao07;
import java.util.Scanner;
public class Principal{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro lado: ");
        int l1 = scanner.nextInt();
        System.out.println("Informe o segundo lado: ");
        int l2 = scanner.nextInt();
        System.out.println("Informe o terceiro número: ");
        int l3 = scanner.nextInt();

        if(l1==l2 && l1==l3 && l2==l3) System.out.println("Triângulo equilátero.");
        else if(l1!=l2 && l1!=l3 && l2!=l3) System.out.println("Triângulo escaleno");
        else System.out.println("Triângulo isósceles.");
    }
}