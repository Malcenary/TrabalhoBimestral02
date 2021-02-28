package trabalhobimestral02;
import java.util.Scanner;
public class Atv09 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.print("Digite o mês:");
        String mes=leitura.next().toLowerCase();
        
        switch (mes){
            case "dezembro":
                System.out.println("Verão");
            break;
            case "janeiro":
                System.out.println("Verão");
            break;
            case "fevereiro":
                System.out.println("Verão");
            break;
            case "marco":
                System.out.println("Outono");
            break;
            case "abril":
                System.out.println("Outono");
            break;
            case "maio":
                System.out.println("Outono");
            break;
            case "junho":
                System.out.println("Inverno");
            break;
            case "julho":
                System.out.println("Inverno");
            break;
            case "agosto":
                System.out.println("Inverno");
            break;
            case "setembro":
                System.out.println("Primavera");
            break;
            case "outubro":
                System.out.println("Primavera");
            break;
            case "novembro":
                System.out.println("Primavera");
            break;
        }

    }
}