package trabalhobimestral02;
import java.util.Scanner;
public class Atv08 {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        System.out.print("Nome do estudante:");
        String nomeAluno=leitura.next();
        double nota1, nota2, nota3, resultado;
        System.out.print("Primeira Nota:");
        nota1=leitura.nextDouble();
        System.out.print("Segunda Nota:");
        nota2=leitura.nextDouble();
        System.out.print("Terceira Nota:");
        nota3=leitura.nextDouble();
        resultado = (nota1 + nota2 + nota3)/3 ;
        
        if(resultado >= 9){
            System.out.print(nomeAluno +" sua nota é: A");
        }else if(resultado >=8 & resultado <9){
            System.out.print(nomeAluno +" sua nota é: B");
        }else if(resultado >=7 & resultado <8){
            System.out.print(nomeAluno +" sua nota é: C");
        }else if(resultado >=6 & resultado <7){
            System.out.print(nomeAluno +" sua nota é: D");
        }else{
            System.out.print(nomeAluno+" sua nota é: I");
        }
    }
}
