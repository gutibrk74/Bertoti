//Pattern

package bertoti.engenharia3.Strategy.pattern;

public class Main {

    public static void main(String[] args) {

        // Criando comportamentos
        ComportamentoVoo voar = new Voar();
        ComportamentoVoo naoVoar = new NaoVoar();

        // Criando aves com estratégias
        Ave aguia = new Aguia(voar);
        Ave pinguim = new Pinguim(naoVoar);

        System.out.println("Águia:");
        aguia.executarVoo();

        System.out.println("\nPinguim:");
        pinguim.executarVoo();

        // 🔥 Trocando comportamento em tempo de execução
        System.out.println("\nPinguim aprendendo a voar (exemplo hipotético):");
        pinguim.setComportamentoVoo(voar);
        pinguim.executarVoo();
    }
}

// 🔹 Strategy
interface ComportamentoVoo {
    void voar();
}

// 🔹 Estratégias concretas
class Voar implements ComportamentoVoo {
    public void voar() {
        System.out.println("Voando pelos céus!");
    }
}

class NaoVoar implements ComportamentoVoo {
    public void voar() {
        System.out.println("Não pode voar.");
    }
}

// 🔹 Contexto
abstract class Ave {
    protected ComportamentoVoo comportamentoVoo;

    public Ave(ComportamentoVoo comportamentoVoo) {
        this.comportamentoVoo = comportamentoVoo;
    }

    public void executarVoo() {
        comportamentoVoo.voar();
    }

    public void setComportamentoVoo(ComportamentoVoo comportamentoVoo) {
        this.comportamentoVoo = comportamentoVoo;
    }
}

// 🔹 Classes concretas
class Aguia extends Ave {
    public Aguia(ComportamentoVoo comportamentoVoo) {
        super(comportamentoVoo);
    }
}

class Pinguim extends Ave {
    public Pinguim(ComportamentoVoo comportamentoVoo) {
        super(comportamentoVoo);
    }
}
