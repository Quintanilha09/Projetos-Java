package animais;

public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase == "Oi" || frase == "Fofinho") {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade) {
        if (idade > 15) {
            System.out.println("Sem reação, está velho demais para se importar");
        } else {
            System.out.println("Pronto para brincar");
        }
    }
}
