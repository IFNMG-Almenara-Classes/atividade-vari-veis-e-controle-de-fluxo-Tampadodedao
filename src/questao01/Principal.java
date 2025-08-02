package questao01;

import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = entrada.nextInt();

        System.out.println("O maior númro é: " + ((x>y) ? x : y));
    }
}

/**
 * package questão01;
 * 
 * public class Principal{
 *      public static void main(String[]args){
 *          System.out.println("Hello World!");}}
 */