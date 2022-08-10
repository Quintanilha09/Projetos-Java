package projetos.contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        ClassContaBanco conta1 = new ClassContaBanco();
        conta1.abrirConta("CC");
        conta1.setDono("Quintanilha");
        conta1.setNumConta(3844);
        conta1.retorno();
        conta1.depositar(50);
        conta1.sacar(100);
        conta1.fecharConta();

        ClassContaBanco conta2 = new ClassContaBanco();
        conta2.abrirConta("CP");
        conta2.setDono("Manoel");
        conta2.setNumConta(4562);
        conta2.retorno();
        conta2.depositar(50);
        conta2.fecharConta();

        ClassContaBanco conta3 = new ClassContaBanco();
        conta3.abrirConta("CC"); 
        conta3.setDono("Marcos");
        conta3.setNumConta(5446);
        conta3.retorno();
        conta3.sacar(40);

    }
}