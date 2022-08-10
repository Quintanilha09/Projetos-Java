package projetos.lutaboxe;

public class ClassLutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //métodos especiais

    public ClassLutador(String name, String nation, int age, double height, float weight, int victory, int defeats, int tie) {
        this.setNome(name);
        this.setNacionalidade(nation);
        this.setIdade(age);
        this.setPeso(weight);
        this.setVitorias(victory);
        this.setDerrotas(defeats);
        this.setEmpates(tie);
        this.apresentar();


    } 
    
    public void setNome(String name) {
        this.nome = name;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNacionalidade(String nation) {
        this.nacionalidade = nation;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setIdade(int age) {
        this.idade = age;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura(float height) {
        this.altura = height;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setPeso(float weight) {
        this.peso = weight;

        if (this.getPeso() < 50) {
            setCategoria("Inválido");
        } else {
            if (this.getPeso() >= 50 && this.getPeso() < 70) {
                setCategoria("Leve");
            } else {
                if (this.getPeso() >= 70 && this.getPeso() < 90) {
                    setCategoria("Medio");
                } else {
                    if (this.getPeso() >= 90) {
                        setCategoria("Pesado");
    
                    }
                }
            }
        }  
    }

    public float getPeso() {
        return this.peso;

    }

    public void setCategoria(String category) {
        this.categoria = category;
        
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setVitorias(int victory) {
        this.vitorias = victory;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setDerrotas(int defeats) {
        this.derrotas = defeats;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setEmpates(int tie) {
        this.empates = tie;
    }

    public int getEmpates() {
        return this.empates;
    }

    //fim métodos especiais

    //métodos públicos

    public void apresentar() {
        System.out.println("E agora, apresentando: " + this.getNome());
        System.out.println("Direto de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("--------------------------------------");

    }

    public void status() {
        System.out.println("Status atualizado depois de luta de hoje:");
        System.out.println("Ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas");
        System.out.println("Empatou " + this.getEmpates() + " lutas");
        System.out.println("\n\n");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    //fim métodos públicos

}
