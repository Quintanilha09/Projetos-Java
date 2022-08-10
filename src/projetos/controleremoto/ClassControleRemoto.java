package controleremoto;

public class ClassControleRemoto implements InterfaceControle {
    //atributos
    private int volume;
    private Boolean ligado;
    private Boolean tocando;

    //metodos especiais
    public ClassControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setLigado(Boolean l) {
        this.ligado = l;
    }

    private Boolean getLigado() {
        return this.ligado;
    }

    private void setTocando(Boolean t) {
        this.tocando = t;
    }

    private Boolean getTocando() {
        return this.tocando;
    }

    //fim metodos especiais

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());

        for (int i = 1; i <= this.getVolume(); i+= 10) {
            System.out.print("I");
        }
        System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);   
        } else {
            if (!this.getLigado()) {
                System.out.println("Impossível aumentar o volume, pois o controle está desligado");
            }
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            if (!this.getLigado()) {
                System.out.println("Impossível diminuir o volume, pois o controle está desligado");
            }
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && (this.getVolume() > 0)) {
            this.setVolume(0);
            System.out.println("Mudo ligado Ø");
        } else {
            if (this.getVolume() == 0) {
                System.out.println("Impossível ligar o mudo, pois o volume já está no 0");
            } else {
                if (!this.getLigado()) {
                    System.out.println("Impossível ligar o mudo, pois o controle está desligado");
                }
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mudo desligado");
        } else {
            if (this.getVolume() > 0) {
                System.out.println("Impossível desligar o mudo, pois ele não está ligado");
            } else {
                if (!this.getLigado()) {
                    System.out.println("Impossível desligar o mudo, pois o controle está desligado");
                }
            }
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
       
}
