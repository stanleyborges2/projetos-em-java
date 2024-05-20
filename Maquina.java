import java.util.Scanner;

public class Maquina {
    public static void main(String[] args) {
        // Definindo os preços dos bilhetes
        double precoBilheteUnico = 4.00;
        double precoBilheteMensal = 40.00;
        double precoBilheteDiario = 10.00;

        Scanner scanner = new Scanner(System.in);
        // Exibindo as opções de bilhetes

        System.out.println("Bem vindo a Máquina de Venda de Bilhetes!");
        System.out.println("Por favor, selecione uma opção de bilhete:\n");
        System.out.println("1. Bilhete único (R$ 4,00)");
        System.out.println("2. Bilhete mensal (R$ 40,00)");
        System.out.println("3. Bilhete diário (R$ 10,00)\n");

        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        // Verificando a opção selecionada e o valor inserido

        double precoSelecionado = 0.0; 
        String tipoBilhete = ""; // inicializando a variável tipoBilhete como uma string vazia para o usuário selecionar a opção desejada
        switch (opcao) {
                 // implementação do código
            case 1:
                precoSelecionado = precoBilheteUnico;
                tipoBilhete = "Bilhete unico";
                break; // break para sair do switch
            case 2:
                precoSelecionado = precoBilheteMensal;
                tipoBilhete = "Bilhete mensal";
                break;// break para sair do switch
            case 3:
                precoSelecionado = precoBilheteDiario;
                tipoBilhete = "Bilhete diario";
                break; // break para sair do switch

            default: // caso a opção não seja 1, 2 ou 3 o programa ira encerrar com a mensagem de opção inválida
                System.out.println("Opção inválida. Saindo do programa.");
                System.exit(1);
        }

        System.out.printf("\nInsira o valor exato em dinheiro %s (R$ %.2f): ", tipoBilhete, precoSelecionado);
        double valorInserido = scanner.nextDouble();

        if (valorInserido < precoSelecionado) {
            System.out.println("Valor inserido insuficiente deposite mais dinheiro.");
        
        } else {
           
            double troco = valorInserido - precoSelecionado;
            System.out.printf("%s fornecido com sucesso Obrigado pela compra!\n", tipoBilhete); // mensagem de compra bem sucedida
            if (troco > 0) { // se o troco for maior que zero
               
                System.out.printf("Troco: R$ %.2f \n", troco); 
                
                // troco em reais ultilizando duas casas decimais %2f

                System.out.println(" Obrigado por utilizar nossos serviços, volte sempre! \n"); // mensagem de agradecimento
            }
        }

        scanner.close();
    }
}
