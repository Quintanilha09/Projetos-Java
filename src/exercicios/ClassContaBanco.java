package exercicios;

public class ClassContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;


    //MÉTODOS ESPECIAIS

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    //FIM MÉTODOS ESPECIAIS

    public void retorno() {
        System.out.println("Nome: " + getDono());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipo() );
    }

    public void abrirConta(String t) {
        if (t == "CC") {
            this.saldo = 50;
            this.tipo = "Conta Corrente";
            System.out.println("Você ganhou R$" + this.saldo +  " por ter aberto uma conta poupança ");
        } else {
            if (t == "CP") {
                this.saldo = 150;
                this.tipo = "Conta Poupança ";
                System.out.println("Você ganhou R$" + this.saldo + " por ter aberto uma conta corrente");
            }
        }
    }

    public void fecharConta() {
       
    }

    public void depositar(float v) {
           this.saldo += v; 
           System.out.println("Seu saldo agora é de R$" + getSaldo());
    }

    public void sacar(float saq) {
            this.saldo -= saq;
            System.out.println("Seu saldo agora é de R$" + getSaldo());
    }

    public void pagarMensalidade() {

    }
}
