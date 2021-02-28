package trabalhobimestral02;

import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota1, nota2, resultado;
        
        System.out.println("Calculo notas com resultado aprovado ou reprovado.");
        System.out.print("Primeira Nota:");
        nota1=leitura.nextDouble();
        System.out.print("Segunda Nota:");
        nota2=leitura.nextDouble();
        resultado = (nota1 + nota2)/2;
        if(resultado <= 6.9){
            System.out.print("Reprovado");
        }else{
            System.out.print("Aprovado");
        }
    }
    
}
