import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String Agencia = scanner.next();
           
        System.out.println("Digite o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double Saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agância é " + Agencia + " e seu saldo R$" + Saldo + " já está disponível para saque.");

        
    }
}
