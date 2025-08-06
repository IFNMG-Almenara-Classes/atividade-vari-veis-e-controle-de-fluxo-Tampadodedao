package questao02;
import java.util.Scanner;

public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Informe o seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso/(altura*altura);

        if(imc<18.5) System.out.println("Seu IMC é " + imc + " e você está magro.");
        else if(imc>=18.5 && imc<=24.9) System.out.println("Seu IMC é " + imc + " e você está saudável.");
        else if(imc>=25 && imc<=29.9) System.out.println("Seu IMC é " + imc + " e você está cheinho.");
        else if(imc>=30 && imc<=34.9) System.out.println("Seu IMC é " + imc + " e você está GORDIN.");
        else if(imc>=35 && imc<=39.9) System.out.println("Seu IMC é " + imc + " e você está GORDO.");
        else System.out.println("Seu IMC é " + imc + " e você está GORDÃO.");
    }
}