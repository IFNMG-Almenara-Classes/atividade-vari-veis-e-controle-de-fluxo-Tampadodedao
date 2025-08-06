package questao04;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = scanner.nextInt();
        System.out.println(senha==1234?"ACESSO PERMITIDO":"ACESSO NEGADO");
    }
}