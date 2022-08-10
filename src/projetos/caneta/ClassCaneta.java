package projetos.caneta;
public class ClassCaneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não pode ser rabiscada. Está tampada");
        } else {
            System.out.println("Temos um rabisco");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}