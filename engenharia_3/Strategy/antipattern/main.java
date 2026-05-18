//Antipattern

package bertoti.engenharia3.Strategy.antipattern;

class Main {

    public static void main(String[] args) {

        Ave ave1 = new Aguia();
        Ave ave2 = new Pinguim();

        System.out.println("Testando águia:");
        fazerAveVoar(ave1);

        System.out.println("\nTestando pinguim:");
        fazerAveVoar(ave2); //  vai dar erro
    }

    public static void fazerAveVoar(Ave ave) {
        ave.voar();
    }
}

// Classe base
class Ave {
    public void voar() {
        System.out.println("A ave está voando...");
    }
}

// Classe que funciona corretamente
class Aguia extends Ave {
    @Override
    public void voar() {
        System.out.println("A águia está voando alto!");
    }
}

//  Antipadrão aqui
class Pinguim extends Ave {
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguim não pode voar!");
    }
}
