import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double imposto = 0.60; //60% de imposto
        double preco; 

        System.out.println("Qual o valor do PRODUTO ? U$D");
        preco = teclado.nextDouble();

        double valorImposto = preco * imposto; //calcula o valor do imposto 
        double precoFinal = preco + valorImposto; // adiciona o imposto ao valor do produto

        System.out.println("O valor do imposto é de U$D: " + valorImposto);  
        System.out.println("O valor final do produto é de U$D: " + precoFinal);
        
        teclado.close();

    }
}