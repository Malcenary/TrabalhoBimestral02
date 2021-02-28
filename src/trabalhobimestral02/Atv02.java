package trabalhobimestral02;
import java.util.Scanner;
public class Atv02 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        
        System.out.print("Digite o ano:");
        int ano=leitura.nextInt();
        if(ano < 0){
            System.out.print("Antes de Cristo");
        }else{
            System.out.print("Depois de Cristo");
        }
    }
}
