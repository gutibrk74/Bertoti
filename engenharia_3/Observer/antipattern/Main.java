package bertoti.engenharia3.Observer.antipattern;
class CanalYouTube {

    public void notificar() {
        System.out.println("João recebeu notificação");
        System.out.println("Maria recebeu notificação");
    }
}

public class Main {
    public static void main(String[] args) {
        CanalYouTube canal = new CanalYouTube();
        canal.notificar();
    }
}
