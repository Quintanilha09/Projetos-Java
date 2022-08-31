package projetoescola;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //METODOS ESPECIAIS

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    //METODOS

    public void pagarMensalidade() {
        System.out.println("Mensalidade do aluno " + this.nome + " paga");
    } 

    
}
