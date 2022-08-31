package testetrycatch;

public class TryCatch {
    protected String nome;
    protected int idade;

    public TryCatch(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);

        if (this.nome != "Quintanilha") {
            throw new RuntimeException("Nome não autenticado");
        } else {
            throw new RuntimeException("Bem vindo");
        }
    }

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

    
}
