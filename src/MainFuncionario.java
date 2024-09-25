
abstract class Funcionario {
    protected String nome;
    protected double salario;

    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
    public abstract double calcularBonus();

    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: " + salario);
    }
}


class Gerente extends Funcionario {
    
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    
    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}


class Analista extends Funcionario {
    // Construtor
    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    
    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}


public class MainFuncionario {
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente("Carlos", 8000.0);
        gerente.exibirInformacoes();
        System.out.println("Bônus do Gerente: " + gerente.calcularBonus());

        
        Funcionario analista = new Analista("Ana", 5000.0);
        analista.exibirInformacoes();
        System.out.println("Bônus do Analista: " + analista.calcularBonus());
    }
}
