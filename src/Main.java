import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Taffe taffe = new Taffe();
        String fala = taffe.dizerOi();
        System.out.println(fala);

        taffe.falar("Gremio melhor que inter");
        taffe.falar("Aprendendo Classes em Java");


        taffe.andar(10);

    }
}