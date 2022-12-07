
public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial(int numero, String nome_titular,double saldo,double limite){
        super(numero,nome_titular,saldo);
        this.limite = limite;
    }
    public boolean sacar(double valor){
        if(valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
