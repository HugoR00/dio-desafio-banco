public class ContaCorrente extends Conta {

    @Override
    public void sacar(double valor) {
    }
    @Override
    public void depositar(double valor) {
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-------Extrato da conta corrente-------");
        super.impressaoExtrato();
    }
}
