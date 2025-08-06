package questao05;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantas laranjas você comprou: ");
        float la = scanner.nextFloat();
        if(la>=12)
        {
            System.out.println("Valor total da compra: " + la*0.3);
        }
        else if(la>0)
        {
            System.out.println("Valor total da compra: " + la*0.5);
        } 
    }
}