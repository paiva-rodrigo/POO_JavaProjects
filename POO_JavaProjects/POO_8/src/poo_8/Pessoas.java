package poo_8;
public  class  Pessoas {
    private String nome;
    private String sexo;
    private int idade;

    public void FazerAnv(){
        this.idade++;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoas{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }

}
