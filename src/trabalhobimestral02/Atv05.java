package trabalhobimestral02;
import java.util.Scanner;
public class Atv05 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        double nota1, nota2, nota3, resultado;
        
        System.out.println("Calculo notas com resultado aprovado ou reprovado.");
        System.out.print("Primeira Nota:");
        nota1=leitura.nextDouble();
        System.out.print("Segunda Nota:");
        nota2=leitura.nextDouble();
        System.out.print("Terceira Nota:");
        nota3=leitura.nextDouble();
        resultado = (nota1 + nota2 + nota3)/3;
        if(resultado >= 7){
            System.out.print("Aprovado.");
        }else if(resultado >= 4 & resultado < 7){
            System.out.print("Exame.");
        }else{
            System.out.print("Reprovado.");
        }
    }
}
