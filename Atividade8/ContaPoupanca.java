
public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String nome_titular,double saldo){
        super(numero,nome_titular,saldo);
    }
    
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
