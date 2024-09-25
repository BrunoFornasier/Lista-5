import java.util.ArrayList;
import java.util.List;


interface Eletronico {
    void ligar();    
    void desligar(); 
}


abstract class Dispositivo implements Eletronico {
    protected String marca;
    protected String modelo;

    
    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}


class Celular extends Dispositivo {
    
    public Celular(String marca, String modelo) {
        super(marca, modelo);
    }

    
    @Override
    public void ligar() {
        System.out.println("O celular " + marca + " " + modelo + " está ligando.");
    }

    
    @Override
    public void desligar() {
        System.out.println("O celular " + marca + " " + modelo + " está desligando.");
    }
}


class Tablet extends Dispositivo {
    
    public Tablet(String marca, String modelo) {
        super(marca, modelo);
    }

    
    @Override
    public void ligar() {
        System.out.println("O tablet " + marca + " " + modelo + " está ligando.");
    }

    
    @Override
    public void desligar() {
        System.out.println("O tablet " + marca + " " + modelo + " está desligando.");
    }
}


public class MainEletronico {
    public static void main(String[] args) {
        
        List<Eletronico> eletronicos = new ArrayList<>();

        
        eletronicos.add(new Celular("Apple", "iPhone 13"));
        eletronicos.add(new Tablet("Samsung", "Galaxy Tab S7"));

        
        for (Eletronico eletronico : eletronicos) {
            if (eletronico instanceof Dispositivo dispositivo) {
                dispositivo.exibirInformacoes();
            }
            eletronico.ligar();
            eletronico.desligar();
            System.out.println("----------------------------");
        }
    }
}
