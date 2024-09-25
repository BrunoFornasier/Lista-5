
abstract class Animal {
    
    public abstract void fazerSom();
}


class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}


class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau");
    }
}


class Pato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O pato faz: Quack Quack");
    }
}


class SomDosAnimais {
    
    public void emitirSom(Animal animal) {
        animal.fazerSom();
    }
}


public class Main {
    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal pato = new Pato();

        
        SomDosAnimais somDosAnimais = new SomDosAnimais();

        
        somDosAnimais.emitirSom(cachorro);
        somDosAnimais.emitirSom(gato);
        somDosAnimais.emitirSom(pato);
    }
}
