package projetoescola;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //METODOS

    public void fazerAniversario() {

    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
    
}
