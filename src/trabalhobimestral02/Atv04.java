package trabalhobimestral02;
import java.util.Scanner;
public class Atv04 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.println("Verificação de numero divisivel por 3");
        System.out.print("Digite o numero:");
        double numero = leitura.nextDouble();
        if(numero % 3 == 0 ){
            System.out.print("Divisivel");
        }else{
            System.out.print("Nâo divisivel");
        }
    }
}
