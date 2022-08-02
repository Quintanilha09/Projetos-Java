package exercicios;

public class Piano {
    public static void main(String[] args) {
        ClassPiano piano1 = new ClassPiano();
        piano1.tamanho = 1.30f;
        piano1.funcoes = 140;
        piano1.marca = "Yamaha";
        piano1.base = false;
        piano1.capa = true;
        piano1.status();

        ClassPiano piano2 = new ClassPiano();
        piano2.tamanho = 1.40f;
        piano2.funcoes = 200;
        piano2.marca = "Steinway";
        piano2.base = true;
        piano2.capa = false;
        piano2.status();

    }
}
