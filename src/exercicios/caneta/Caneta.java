package exercicios.caneta;

public class Caneta {
    public static void main(String[] args) {
        ClassCaneta c1 = new ClassCaneta();
        c1.carga = 50;
        c1.cor = "Vermelha";
        c1.modelo = "Bic";
        c1.ponta = 1.0f;
        c1.destampar();
        c1.rabiscar();
        c1.status();

        ClassCaneta c2 = new ClassCaneta();
        c2.carga = 10;
        c2.cor = "Azul";
        c2.modelo = "Faber Castel";
        c2.ponta = 0.5f;
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }

}

