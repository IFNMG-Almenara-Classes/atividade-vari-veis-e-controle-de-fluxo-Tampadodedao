package questao011;
import java.util.Scanner;
public class Principal{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro e positivo: ");
        int i = scanner.nextInt();
        if(i<=0) System.out.println("ERRO!");
        else
        {
            if(i%2==0)
            {
                for(int c=0; c<i; c+=2)
                    System.out.println(c);
            }
        }
    }
}