package trabalhobimestral02;
import java.util.Scanner;
public class Atv07 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.print("Informe sua idade:");
        int idade = leitura.nextInt();
        if(idade < 16){
            System.out.print("Não eleitor");
        }else if(idade >= 18 & idade <= 65){
            System.out.print("Eleitor obrigatóio");
        }else{
            System.out.print("Eleitor facultativo");
        }
        
        
        
    }
}
