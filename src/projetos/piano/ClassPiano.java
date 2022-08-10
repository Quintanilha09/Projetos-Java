package projetos.piano;

public class ClassPiano {
    public String marca;
    public float tamanho;
    public int funcoes;
    public Boolean base;
    public Boolean capa;

    public void temBase() {
        this.base = true;
        System.out.println("Vamos montar então.");
    }

    public void semBase() {
        this.base = false;
        System.out.println("Bora tocar no chão mesmo.");
    }

    public void verificaMarca() {
        if (this.marca == "Yamaha") {
            System.out.println(this.marca + " ÓTIMA MARCA!");
        } else {
            System.out.println(this.marca + " Dá pro gasto");
        }
    }

    public void encapada() {
        this.capa = true;
        System.out.println("Tira e vamos fazer um som.");
    }

    public void desencapada() {
        this.capa = false;
        System.out.println("Vamos tocar.");
    }

    public void status() {
        System.out.println("Marca: " + this.marca);
        verificaMarca();
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Funções: " + this.funcoes);
        System.out.println("Base: " + this.base);
        if (base == true) {
            temBase();
        } else {
            semBase();
        }
        System.out.println("Capa: " + this.capa);
        if (capa == true) {
            encapada();
        } else {
            desencapada();
        }
    }


}
