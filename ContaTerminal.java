import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pelo scanner os valores digitados no terminal
        // Exibir mensagem de conta criada

        Scanner input = new Scanner(System.in);
        System.out.println("BANCO SANTANDER\n");

        System.out.println("Digite a sua agência com o digito final: ");
        String agen = input.next();

        System.out.println("Digite o número da sua conta: ");
        int num = input.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        System.out.println("Saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nome + "! obrigado por criar uma conta em nosso banco, sua agência é: "
        + agen + " , conta " + num + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}