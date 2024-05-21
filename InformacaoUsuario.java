import java.util.Scanner;  //IMPORTAR OQUE O USUARIO DIGITAR
import java.io.FileWriter; // IMPORTAR O ARQUIVO
import java.io.IOException; 

public class InformacaoUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        //solicitar os dados do usuario
       
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine(); //limpar o buffer do teclado

        System.out.println("DIGITE O SEU EMAIL:");
        String email = scanner.nextLine();


        //salvar os dados do usuario em um arquivo

        try {
            FileWriter arquivo = new FileWriter("usuario.txt", true);
            arquivo.write("Nome: " + nome + "\n");

            arquivo.write("Idade: " + idade + "\n");

            arquivo.write("Email: " + email + "\n");

            arquivo.write("...........................................................\n");

            arquivo.close();
            System.out.println("Dados salvos com sucesso!");
        
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados do usuario...." + e.getMessage());
        }

        scanner.close();

    }
}
