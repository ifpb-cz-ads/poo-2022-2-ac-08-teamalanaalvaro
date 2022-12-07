import java.util.Scanner;
public class ContaInstancia{
    public static void main(String[] args){
        Conta c = null;
        Cliente jose = new Cliente("José", "11122233344");
        Scanner scan = new Scanner(System.in);
        int opcao;
        boolean sucesso;
        do {
            System.out.println("Qual tipo de conta deseja criar para José?");
            System.out.println("1 - Conta Especial");
            System.out.println("2 - Conta Poupança");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    c = new ContaEspecial(1, jose, 0, 100);
                    sucesso = true;
                    break;
                case 2:
                    c = new ContaPoupanca(1, jose, 0);
                    sucesso = true;
                    break;
                default:
                    System.out.println("Valor inválido!");
                    sucesso = false;
            }
        } while (!sucesso);
        c.imprimirTipoConta();
    }
}
