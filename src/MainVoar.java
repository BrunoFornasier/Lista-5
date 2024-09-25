
interface Voar {
    void decolar();  
}

// Interface Nadar
interface Nadar {
    void mergulhar();  
}


class Pato implements Voar, Nadar {
    @Override
    public void decolar() {
        System.out.println("O pato está decolando e voando.");
    }

    @Override
    public void mergulhar() {
        System.out.println("O pato está mergulhando na água.");
    }
}


public class MainVoar {
    public static void main(String[] args) {
        
        Pato pato = new Pato();

        
        System.out.println("Ação de voar:");
        pato.decolar();  

        System.out.println("\nAção de nadar:");
        pato.mergulhar();  
    }
}
