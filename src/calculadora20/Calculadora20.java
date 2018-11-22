
package calculadora20;

import java.util.Scanner;


public class Calculadora20 {
      
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            double n1 = ler.nextDouble();
            System.out.println("Digite o segundo número:");
            double n2 = ler.nextDouble();
            System.out.println("Digite: \n"
                + "+ pra somar \n"
                + "- para subtrair \n"
                + "* para multiplicar \n"
                + "/ para dividir");
            char caracter = ler.next().charAt(0);
            switch(caracter){
                case '+':
                    Operacoes.somar (n1, n2);
                case '-':
                    Operacoes.subtrair (n1, n2);
                case '*':
                    Operacoes.multiplicar(n1, n2);
                case '/':
                    Operacoes.dividir(n1, n2);
                default:
                    System.out.println("Por favor, digite um caracter válido.");
            }
            
    }
    
}
