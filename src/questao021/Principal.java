package questao021;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Informe a sua contribuição: ");
        int contri = scanner.nextInt();

        if(idade>=65 || contri>=30 || idade>=60 && contri>=25) {System.out.println("Pode aposentar.");}
        else System.out.println("Não pode aposentar.");
    }
}