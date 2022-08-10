package computador;

public class ClassComputador {
    private String modelo;
    private String processador;
    public boolean ligado;

    public ClassComputador(String m, String p) { //metodo construtor
        this.ligar();
        this.modelo = m;
        this.processador = p;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getProcessador() {
        return this.processador;
    }

    public void setProcessador(String p) {
        this.processador = p;
    }

    public void status() {
        System.out.println("Sobre o computador:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Processador: " + this.getProcessador());
        System.out.println("Está ligado? " + this.ligado);
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }
}
