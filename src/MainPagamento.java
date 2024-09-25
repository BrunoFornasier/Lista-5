import java.util.ArrayList;
import java.util.List;


interface Pagavel {
    double calcularPagamento();
}


abstract class Pessoa {
    protected String nome;
    protected String documento;

    
    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Documento: " + documento);
    }
}


class Empregado extends Pessoa implements Pagavel {
    private final double salario;

    
    public Empregado(String nome, String documento, double salario) {
        super(nome, documento);
        this.salario = salario;
    }

    
    @Override
    public double calcularPagamento() {
        return salario;
    }
}


class Fornecedor extends Pessoa implements Pagavel {
    private final double valorContrato;


    public Fornecedor(String nome, String documento, double valorContrato) {
        super(nome, documento);
        this.valorContrato = valorContrato;
    }

    
    @Override
    public double calcularPagamento() {
        return valorContrato;
    }
}


public class MainPagamento {
    public static void main(String[] args) {
        
        List<Pagavel> pagaveis = new ArrayList<>();

        
        Empregado empregado = new Empregado("João", "123456789", 3000.0);
        Fornecedor fornecedor = new Fornecedor("Maria", "987654321", 5000.0);

        
        pagaveis.add(empregado);
        pagaveis.add(fornecedor);

        
        for (Pagavel pagavel : pagaveis) {
            if (pagavel instanceof Pessoa pessoa) {
                pessoa.exibirInformacoes();
            }
            System.out.println("Pagamento: " + pagavel.calcularPagamento());
            System.out.println("----------------------------");
        }
    }
}
