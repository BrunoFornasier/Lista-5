import java.util.ArrayList;
import java.util.List;


abstract class Forma {
    
    public abstract double calcularArea();
}


class Circulo extends Forma {
    private double raio;

    
    public Circulo(double raio) {
        this.raio = raio;
    }

    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}


class Retangulo extends Forma {
    private double largura;
    private double altura;

    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
}


public class MainForma {
    
    public static void imprimirAreas(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }

    public static void main(String[] args) {
        
        List<Forma> formas = new ArrayList<>();

        
        formas.add(new Circulo(5.0));       
        formas.add(new Retangulo(4.0, 6.0)); 

        
        imprimirAreas(formas);
    }
}
