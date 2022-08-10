package guitarra;

public class Guitarra {
    public static void main(String[] args) {
        ClassGuitarra guitar1 = new ClassGuitarra();
        guitar1.marca = "Tagima";
        guitar1.cordas = "Cobra";
        guitar1.cor = "Preta";
        guitar1.desencapar();
        guitar1.status();
        guitar1.tocar();

        ClassGuitarra guitar2 = new ClassGuitarra();
        guitar2.cordas = "NIG";
        guitar2.cor = "Vermelha";
        guitar2.marca = "Holfma";
        guitar2.encapar();
        guitar2.status();
        guitar2.tocar();

        
    }
}
