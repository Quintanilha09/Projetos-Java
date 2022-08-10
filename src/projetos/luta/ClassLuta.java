package projetos.luta;

import java.util.Random;

public class ClassLuta {
    //atributos
    private ClassLutador desafiado;
    private ClassLutador desafiante;
    private int rounds;
    private Boolean lutaAprovada;

    //métodos especiais
    public void setDesafiado(ClassLutador desafiado) {
        this.desafiado = desafiado;
    }

    public ClassLutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(ClassLutador desafiante) {
        this.desafiante = desafiante;
    }

    public ClassLutador getDesafiante() {
        return desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }


    //métodos

    public void marcarLuta(ClassLutador lutador1, ClassLutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.lutaAprovada = true;
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        } else {
            this.lutaAprovada = false;
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void escolhaVencedor() {
        Random valorAleatorio = new Random();
        int vencedor = valorAleatorio.nextInt(3);
        switch(vencedor) {
            case 0: 
                System.out.println("EMPATE");
                System.out.println("--------------------------------------\n\n");
                getDesafiado().empatarLuta();
                getDesafiante().empatarLuta();
                break;
            
            case 1:
                System.out.println(this.desafiado.getNome() + " ganhou a luta");
                System.out.println("--------------------------------------\n\n");
                getDesafiado().ganharLuta();
                getDesafiante().perderLuta();
                break;
            
            case 2:
                System.out.println(this.desafiante.getNome() + " ganhou a luta");
                System.out.println("--------------------------------------\n\n");
                getDesafiante().ganharLuta();
                getDesafiado().perderLuta();
                break; 
        }
    }



    public void apresentarLutadores() {
        System.out.println("--------------------------------------");
        System.out.println("DESAFIADO:");
            getDesafiado().apresentar();
            System.out.println("DESAFIANTE:");
            getDesafiante().apresentar();
    }

    public void lutar() {
        if (this.lutaAprovada) {
            apresentarLutadores();
            escolhaVencedor();
        } else {
            System.out.println("A luta não pôde acontecer");
        }
    }
}
