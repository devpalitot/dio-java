package edu.alexandre.primeirasemana;
import java.util.Scanner; //scanner é essencial para a entrada e leitura de dados. 

public class calculosimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //nessa linha acontece a criação do objeto scanner
        
        System.out.print("Digite um valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite outro valor: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Escolha uma operação: +, -, *, /");
        char operacao = scanner.next().charAt(0);
        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
            System.out.printf("O resultado é: %.2f%n", valor1 + valor2);
            break;
            case '-':
            System.out.printf("O resultado é: %.2f%n", valor1 - valor2);
            break;
            case '*':
            System.out.printf("O resultado é: %.2f%n", valor1 * valor2);
            break;
            case '/':
            System.out.printf("O resultado é: %.2f%n", valor1 / valor2);
            if (valor2 != 0){
                resultado = valor1/valor2;
            } else {
                System.out.println("Operação Inválida, divisão por zero.");
                operacaoValida = false;
            }
            
                
            break;
            default:
            System.out.println("Operação inválida");
            operacaoValida = false;
        }
        scanner.close();
       
    }
}
