
public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial(int numero, Cliente cliente,double saldo,double limite) {
        super(numero, cliente, saldo);
        this.limite = limite;
    }
    public boolean sacar(double valor) {
        if (valor <= this.limite + this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public void imprimirTipoConta() {
        System.out.println("Conta Especial");
    }
}
