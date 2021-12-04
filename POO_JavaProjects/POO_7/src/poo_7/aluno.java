package poo_7;
public class aluno extends Pessoas{
    private int matricula;
    private String curso;
    
    public void cancelarMat(){
        System.out.println("Matricula cancelada!");  
    }

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
    
}
