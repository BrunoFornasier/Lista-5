
abstract class ContaBancaria {
    protected double saldo;

    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public abstract double calcularRendimento();

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado: " + valor + ". Novo saldo: " + saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}


class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_RENDIMENTO = 0.02; 

    // Construtor
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    
    @Override
    public double calcularRendimento() {
        return saldo * TAXA_RENDIMENTO;
    }
}


class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    
    @Override
    public double calcularRendimento() {
        return 0;  
    }
}


public class MainContaBancaria {
    public static void main(String[] args) {
        
        ContaBancaria contaPoupanca = new ContaPoupanca(1000.0);
        contaPoupanca.exibirSaldo();
        contaPoupanca.depositar(500.0);
        System.out.println("Rendimento da Conta Poupança: " + contaPoupanca.calcularRendimento());

        System.out.println("----------------------------");

        
        ContaBancaria contaCorrente = new ContaCorrente(1000.0);
        contaCorrente.exibirSaldo();
        contaCorrente.depositar(500.0);
        System.out.println("Rendimento da Conta Corrente: " + contaCorrente.calcularRendimento());
    }
}
