package trabalhobimestral02;
import java.util.Scanner;
public class Atv03 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.print("Digite a sua Idade:");
        int idade=leitura.nextInt();
        if(idade >= 0){
            System.out.print("Idade Válida");
        }else{
            System.out.print("Idade Inválida");
        } 
    }
}
