package trabalhobimestral02;
import java.util.Scanner;
public class Atv06 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        double nota1, nota2, resultado;
        
        System.out.println("Calculo notas.");
        System.out.print("Nota Trabalho:");
        nota1=leitura.nextDouble();
        System.out.print("Nota Prova:");
        nota2=leitura.nextDouble();
        resultado = (nota1 + nota2);
        if(resultado >= 7){
            System.out.print("Aprovado");
        }else if(resultado >= 4 & resultado <= 7){
            System.out.print("Exame");
        }else
            System.out.print("Reprovado");
        
    }
}
