package animais;

public class ProgramaAnimais {
    public static void main(String[] args) {
        Lobo lobinhooo = new Lobo();
        lobinhooo.emitirSom();

        Cachorro cachorrinhooo = new Cachorro();
        cachorrinhooo.emitirSom();

        Cachorro c = new Cachorro();

        c.reagir("COrno");
    }
}
