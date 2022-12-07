
public abstract class Conta{
    private int numero;
    private Cliente cliente;
    protected double saldo;
    
    public Conta(int numero, Cliente cliente,double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public abstract boolean sacar(double valor);
    public double getSaldo() {
        return saldo;
    }
    public abstract void imprimirTipoConta();
}
