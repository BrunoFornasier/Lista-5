import java.util.ArrayList;
import java.util.List;


interface MeioDePagamento {
    void pagar(); 
}


abstract class Transacao {
    protected double valor;

    
    public Transacao(double valor) {
        this.valor = valor;
    }

    
    public abstract void executarTransacao();
}


class CartaoDeCredito extends Transacao implements MeioDePagamento {
    private String numeroCartao;

    
    public CartaoDeCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }


    @Override
    public void pagar() {
        System.out.println("Pagando com cartão de crédito: " + numeroCartao + ", valor: " + valor);
    }

    
    @Override
    public void executarTransacao() {
        pagar(); 
    }
}


class Boleto extends Transacao implements MeioDePagamento {
    private String codigoBoleto;

    
    public Boleto(double valor, String codigoBoleto) {
        super(valor);
        this.codigoBoleto = codigoBoleto;
    }

    
    @Override
    public void pagar() {
        System.out.println("Pagando com boleto: " + codigoBoleto + ", valor: " + valor);
    }

    
    @Override
    public void executarTransacao() {
        pagar(); 
    }
}


public class MainTransacao {
    public static void main(String[] args) {
        
        List<Transacao> transacoes = new ArrayList<>();

        
        transacoes.add(new CartaoDeCredito(1500.0, "1234-5678-9012-3456"));
        transacoes.add(new Boleto(800.0, "BOL123456789"));

        
        for (Transacao transacao : transacoes) {
            transacao.executarTransacao();
            System.out.println("----------------------------");
        }
    }
}
