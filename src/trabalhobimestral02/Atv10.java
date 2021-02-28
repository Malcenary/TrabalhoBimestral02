package trabalhobimestral02;
import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.print("Digite o Time:");
        String time=leitura.next().toLowerCase();
        
        switch (time){
            case "internacional":
                System.out.println("Gaúcho");
            break;
            case "gremio":
                System.out.println("Gaúcho");
            break;
            case "figueirence":
                System.out.println("Catarinence");
            break;
            case "criciuma":
                System.out.println("Catarinence");
            break;
            case "coritiba":
                System.out.println("Paranaense");
            break;
            case "atletico-pr":
                System.out.println("Paranaense");
            break;
            case "sao paulo":
                System.out.println("Paulista");
            break;
            case "palmeiras":
                System.out.println("Paulista");
            break;
            case "santos":
                System.out.println("Paulista");
            break;
            case "corinthians":
                System.out.println("Paulista");
            break;
            case "fluminence":
                System.out.println("Carioca");
            break;
            case "flamengo":
                System.out.println("Cariocoa");
            break;
            case "vasco":
                System.out.println("Cariocoa");
            break;
            case "botafogo":
                System.out.println("Cariocoa");
            break;
            case "cruzeiro":
                System.out.println("Mineiro");
            break;
            case "atletico-mg":
                System.out.println("Mineiro");
            break; 
            default:
                System.out.println("Time não Cadastrado");
        }  

    }
}