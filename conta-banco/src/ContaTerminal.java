import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String nome = sc.nextLine();

        System.out.println("Digite os 4 primeiros números da conta: ");
        int conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        //--------------------------//

        System.out.println("Olá"+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
