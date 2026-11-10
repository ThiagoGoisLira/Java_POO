package aula05.aula05;
public class Conta {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos personalizados
    public void estadoAtual(){
        System.out.println("*************************************");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Contam aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada pois tem saldo!");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
 
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo (this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depostar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossivel sacar em conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade Paga!" + this.getDono());
        }else{
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }
    //Metodos especiais
    public void Conta(){
        this.setSaldo(0);
        this.setStatus (false);
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
