
public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, Cliente cliente,double saldo){
        super(numero, cliente, saldo);
    }
    
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public void imprimirTipoConta() {
        System.out.println("Conta Poupança");
    }
}
