
interface Ferramenta {
    void usar();    
    void manter();  
}


class Martelo implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando o martelo para bater pregos.");
    }

    @Override
    public void manter() {
        System.out.println("Mantendo o martelo: verificar a cabeça e o cabo.");
    }
}


class Serra implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando a serra para cortar madeira.");
    }

    @Override
    public void manter() {
        System.out.println("Mantendo a serra: afiar as lâminas.");
    }
}


class ChaveDeFenda implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando a chave de fenda para apertar parafusos.");
    }

    @Override
    public void manter() {
        System.out.println("Mantendo a chave de fenda: verificar a ponta.");
    }
}


public class MainFerramenta {
    
    public static void gerenciarFerramentas(Ferramenta[] ferramentas) {
        for (Ferramenta ferramenta : ferramentas) {
            ferramenta.usar();
            ferramenta.manter();
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        
        Ferramenta[] ferramentas = {
            new Martelo(),
            new Serra(),
            new ChaveDeFenda()
        };

        
        gerenciarFerramentas(ferramentas);
    }
}
