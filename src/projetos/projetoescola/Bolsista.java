package projetoescola;

public class Bolsista extends Aluno{
    private int bolsa;

    //METODOS ESPECIAIS

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    //METODOS 
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista. Desconto aplicado com sucesso na mensalidade");
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolda de " + this.nome);
    }
    
}
