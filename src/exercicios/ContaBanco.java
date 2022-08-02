package exercicios;

public class ContaBanco {

    public static void main(String[] args) {
        ClassContaBanco conta1 = new ClassContaBanco();
        conta1.abrirConta("CP");
        conta1.setDono("Quintanilha");
        conta1.setNumConta(3844);
        conta1.retorno();

    }
}