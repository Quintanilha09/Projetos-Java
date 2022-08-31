package projetoescola;

public class ProgramaEscola {
    public static void main(String[] args) {
       Pessoa pessoa1 = new Pessoa();
       Aluno pessoa2 = new Aluno();
       Professor pessoa3 = new Professor();
       Funcionario pessoa4 = new Funcionario();
       Bolsista pessoa5 = new Bolsista();

       pessoa1.setNome("Mário");
       pessoa2.setNome("Clovis");
       pessoa3.setNome("Fábio");
       pessoa4.setNome("Jhonson");

       pessoa2.setCurso("ADS");
       pessoa3.setSalario(3500);
       pessoa4.setSetor("Manutenção");
       pessoa5.setNome("Jonas");

       
       System.out.println(pessoa1.toString());
       System.out.println(pessoa2.toString());
       System.out.println(pessoa3.toString());
       System.out.println(pessoa4.toString());
       pessoa2.pagarMensalidade();
       pessoa5.pagarMensalidade();

       
    }
}
