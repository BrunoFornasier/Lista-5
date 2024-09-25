// Interface Transporte
interface Transporte {
    void mover();  
    void parar();  
}


class Carro implements Transporte {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }
}


class Bicicleta implements Transporte {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}


class Garagem {
    
    public void adicionarTransporte(Transporte t) {
        t.mover();
        t.parar();
    }
}


public class MainTransporte {
    public static void main(String[] args) {
        
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();

        
        Garagem garagem = new Garagem();

        
        System.out.println("Adicionando o carro à garagem:");
        garagem.adicionarTransporte(carro);

        System.out.println("\nAdicionando a bicicleta à garagem:");
        garagem.adicionarTransporte(bicicleta);
    }
}
