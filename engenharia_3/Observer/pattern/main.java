package bertoti.engenharia3.Observer.pattern;

import java.util.*;

interface Observer {
    void update(String mensagem);
}

class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void update(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}

class CanalYouTube {
    private List<Observer> inscritos = new ArrayList<>();

    public void inscrever(Observer o) {
        inscritos.add(o);
    }

    public void notificar(String msg) {
        for (Observer o : inscritos) {
            o.update(msg);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        CanalYouTube canal = new CanalYouTube();

        canal.inscrever(new Usuario("João"));
        canal.inscrever(new Usuario("Maria"));

        canal.notificar("Novo vídeo disponível!");
    }
}
