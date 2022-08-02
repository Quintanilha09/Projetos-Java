package exercicios;

public class ClassGuitarra {
    public String cordas;
    public String marca;
    public String cor;
    private Boolean capa;

    public void encapar() {
        this.capa = true;
    }

    public void desencapar() {
        this.capa = false;
    }

    public void status() {
        System.out.println("Cordas: " + this.cordas);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está com capa? " + this.capa);
    }

    public void tocar() {
        if (this.capa == true) {
            System.out.println("Não posso tocar, está encapada.");
        } else {
            System.out.println("Vamos tocar um rock!");
        }
    }
}
