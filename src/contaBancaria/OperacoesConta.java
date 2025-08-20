package contaBancaria;

public interface OperacoesConta {
    void depositar(double saldo);
    void sacar(double saldo);
    double consultarSaldo();
    void transferir(String contaDestino, double valor);
}
