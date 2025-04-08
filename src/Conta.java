public abstract class Conta implements RegrasConta { //Conta abstrata para que não seja instanciada

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void impressaoExtrato(){
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Número: %d%n",this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    protected void rendimentoPoupanca(double valor){
        this.saldo += this.saldo * 0.5;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}

